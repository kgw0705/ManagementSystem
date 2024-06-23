package com.example.managementsystem.budget.repository;

import com.example.managementsystem.budget.entity.BudgetRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BudgetRequestRepository extends JpaRepository<BudgetRequest, Integer> {
    boolean existsByDepartmentId(Integer departmentId);

    List<BudgetRequest> findByStatus(String status);
}
