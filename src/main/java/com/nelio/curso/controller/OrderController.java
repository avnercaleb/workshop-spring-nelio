package com.nelio.curso.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nelio.curso.entities.Order;
import com.nelio.curso.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	private OrderService service;
	

	public OrderController(OrderService service) {	
		this.service = service;
	}


	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> order = service.findAll();
		return ResponseEntity.ok().body(order);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order order = service.findById(id);
		return ResponseEntity.ok().body(order);
	}
}
	
	
