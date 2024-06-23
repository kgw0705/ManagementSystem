package com.example.managementsystem.budgetcontrol.repository;

import com.example.managementsystem.budgetcontrol.entity.BudgetRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BudgetRequestRepository extends JpaRepository<BudgetRequest, Integer> {
    boolean existsByDepartmentId(Integer departmentId);

    List<BudgetRequest> findByStatus(String status);
}
