package com.nelio.curso.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nelio.curso.entities.Category;
import com.nelio.curso.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	private CategoryRepository repository;

	public CategoryService(CategoryRepository repository) {		
		this.repository = repository;
	}
	
	public List<Category> findAll(){
		List<Category> list = repository.findAll();
		return list;
	}
	
	public Category findById(Long id) {
		Optional<Category> category = repository.findById(id);
		return category.get();
	}
	
}
