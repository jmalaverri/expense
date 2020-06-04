package com.example.codengine.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.codengine.expense.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	Category findByName(String name);
}
