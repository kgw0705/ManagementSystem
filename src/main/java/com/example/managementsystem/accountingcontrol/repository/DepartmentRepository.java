package com.example.managementsystem.accountingcontrol.repository;

import com.example.managementsystem.accountingcontrol.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>
{
    Optional<Object> findByCardNum(String cardNum);
}
