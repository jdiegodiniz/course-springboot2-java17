package com.diegodiniz.couse.repositories;

import com.diegodiniz.couse.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}