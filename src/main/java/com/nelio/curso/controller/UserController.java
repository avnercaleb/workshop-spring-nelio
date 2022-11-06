package com.nelio.curso.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	
	@PostMapping
	public ResponseEntity<User> insert(@RequestBody User user){
		user = service.insert(user);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(user.getId()).toUri();
		return ResponseEntity.created(uri).body(user);
	}
}
	
	
