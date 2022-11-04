package com.nelio.curso.config;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.nelio.curso.entities.User;
import com.nelio.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner{
	
	private UserRepository repository;
	
	public TesteConfig(UserRepository repository) {		
		this.repository = repository;
	}

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		repository.saveAll(Arrays.asList(u1, u2));
	}

}
