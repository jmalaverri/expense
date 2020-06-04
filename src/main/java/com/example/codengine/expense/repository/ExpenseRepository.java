package com.example.codengine.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.codengine.expense.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long>{

}
