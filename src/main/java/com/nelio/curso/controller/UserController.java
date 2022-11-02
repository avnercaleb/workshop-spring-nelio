package com.nelio.curso.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nelio.curso.entities.User;

@RestController
@RequestMapping("/users")
public class UserController {
	

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Avner", "avner@email.com", "71983481349", "a165854973*");
		return ResponseEntity.ok().body(u);
	}
}
	
	
