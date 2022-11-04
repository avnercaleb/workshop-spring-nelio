package com.nelio.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nelio.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
