package com.springboot.firstproject.repositories;

import com.springboot.firstproject.entities.Order;
import com.springboot.firstproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
