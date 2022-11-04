package com.nelio.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nelio.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
