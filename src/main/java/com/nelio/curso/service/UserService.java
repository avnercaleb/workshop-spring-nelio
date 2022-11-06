package com.nelio.curso.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nelio.curso.entities.User;
import com.nelio.curso.repositories.UserRepository;

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
		return user.get();
	}
	
	public User insert(User user) {
		return repository.save(user);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public User update(Long id, User obj) {
		User user = repository.getReferenceById(id);
		updateData(user, obj);
		return repository.save(user);
	}

	private void updateData(User user, User obj) {		
		user.setName(obj.getName());
		user.setEmail(obj.getEmail());
		user.setPhone(obj.getPhone());
	}
}
