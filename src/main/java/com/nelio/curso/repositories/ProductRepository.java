package com.nelio.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nelio.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
