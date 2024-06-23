package com.example.managementsystem.budgetcontrol.repository;

import com.example.managementsystem.budgetcontrol.entity.BudgetItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetItemRepository extends JpaRepository<BudgetItem, Long> {
}
