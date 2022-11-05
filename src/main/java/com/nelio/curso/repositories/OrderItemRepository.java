package com.nelio.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nelio.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
