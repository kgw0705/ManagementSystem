package com.example.managementsystem.accounting.repository;

import com.example.managementsystem.accounting.entity.ExecutionDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExecutionDetailRepository extends JpaRepository<ExecutionDetail, Integer>
{
}
