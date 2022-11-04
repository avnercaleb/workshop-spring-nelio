package com.nelio.curso.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nelio.curso.entities.Category;
import com.nelio.curso.service.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryController {
	
	private CategoryService service;
	

	public CategoryController(CategoryService service) {	
		this.service = service;
	}


	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> category = service.findAll();
		return ResponseEntity.ok().body(category);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category categroy = service.findById(id);
		return ResponseEntity.ok().body(categroy);
	}
}
	
	
