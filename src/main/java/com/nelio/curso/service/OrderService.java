package com.nelio.curso.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nelio.curso.entities.Order;
import com.nelio.curso.entities.User;
import com.nelio.curso.repositories.OrderRepository;

@Service
public class OrderService {
	
	private OrderRepository repository;

	public OrderService(OrderRepository repository) {		
		this.repository = repository;
	}
	
	public List<Order> findAll(){
		List<Order> list = repository.findAll();
		return list;
	}
	
	public Order findById(Long id) {
		Optional<Order> order = repository.findById(id);
		return order.get();
	}
	
}
