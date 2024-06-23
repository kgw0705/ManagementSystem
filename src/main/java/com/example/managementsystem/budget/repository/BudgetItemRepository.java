package com.example.managementsystem.budget.repository;

import com.example.managementsystem.budget.entity.BudgetItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetItemRepository extends JpaRepository<BudgetItem, Long> {
}
