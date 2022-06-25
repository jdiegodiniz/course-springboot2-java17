package com.diegodiniz.couse.repositories;

import com.diegodiniz.couse.entities.OrderItem;
import com.diegodiniz.couse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
