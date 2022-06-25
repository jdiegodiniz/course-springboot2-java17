package com.diegodiniz.couse.repositories;

import com.diegodiniz.couse.entities.Category;
import com.diegodiniz.couse.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
