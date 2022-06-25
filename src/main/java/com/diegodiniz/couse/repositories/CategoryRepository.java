package com.diegodiniz.couse.repositories;

import com.diegodiniz.couse.entities.Category;
import com.diegodiniz.couse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
