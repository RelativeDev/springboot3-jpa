package com.springboot.firstproject.repositories;

import com.springboot.firstproject.entities.OrderItem;
import com.springboot.firstproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
