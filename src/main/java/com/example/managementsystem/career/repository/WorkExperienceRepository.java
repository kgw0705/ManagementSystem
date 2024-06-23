package com.example.managementsystem.career.repository;

import com.example.managementsystem.career.entity.WorkExperience;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WorkExperienceRepository extends JpaRepository<WorkExperience, Integer> {
    Optional<WorkExperience> findByEmployeeId(int employeeId);
}