package com.nelio.curso.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nelio.curso.entities.User;
import com.nelio.curso.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private UserService service;
	

	public UserController(UserService service) {	
		this.service = service;
	}


	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> user = service.findAll();
		return ResponseEntity.ok().body(user);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User user = service.findById(id);
		return ResponseEntity.ok().body(user);
	}
}
	
	
