package com.nelio.curso.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.nelio.curso.entities.User;
import com.nelio.curso.repositories.UserRepository;
import com.nelio.curso.service.exceptions.DatabaseException;
import com.nelio.curso.service.exceptions.ResourceNotFoundException;

@Service
public class UserService {
	
	private UserRepository repository;

	public UserService(UserRepository repository) {		
		this.repository = repository;
	}
	
	public List<User> findAll(){
		List<User> list = repository.findAll();
		return list;
	}
	
	public User findById(Long id) {
		Optional<User> user = repository.findById(id);
		return user.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User user) {
		return repository.save(user);
	}
	
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		}
		catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		}
		catch(DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public User update(Long id, User obj) {
		try {
			User user = repository.getReferenceById(id);
			updateData(user, obj);
			return repository.save(user);
		}
		catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}

	private void updateData(User user, User obj) {		
		user.setName(obj.getName());
		user.setEmail(obj.getEmail());
		user.setPhone(obj.getPhone());
	}
}
