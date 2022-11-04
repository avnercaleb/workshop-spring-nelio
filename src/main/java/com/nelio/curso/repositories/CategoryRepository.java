package com.nelio.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nelio.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
