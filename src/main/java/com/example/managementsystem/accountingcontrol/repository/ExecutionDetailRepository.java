package com.example.managementsystem.accountingcontrol.repository;

import com.example.managementsystem.accountingcontrol.entity.ExecutionDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExecutionDetailRepository extends JpaRepository<ExecutionDetail, Integer>
{
}
