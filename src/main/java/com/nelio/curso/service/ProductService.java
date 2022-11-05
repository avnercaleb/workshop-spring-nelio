package com.nelio.curso.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nelio.curso.entities.Product;
import com.nelio.curso.repositories.ProductRepository;

@Service
public class ProductService {
	
	private ProductRepository repository;

	public ProductService(ProductRepository repository) {		
		this.repository = repository;
	}
	
	public List<Product> findAll(){
		List<Product> list = repository.findAll();
		return list;
	}
	
	public Product findById(Long id) {
		Optional<Product> product = repository.findById(id);
		return product.get();
	}
	
}
