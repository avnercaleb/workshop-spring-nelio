package com.nelio.curso.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nelio.curso.entities.Product;
import com.nelio.curso.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	private ProductService service;
	

	public ProductController(ProductService service) {	
		this.service = service;
	}


	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> product = service.findAll();
		return ResponseEntity.ok().body(product);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product product = service.findById(id);
		return ResponseEntity.ok().body(product);
	}
}
	
	
