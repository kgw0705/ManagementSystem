package com.example.managementsystem.accountingcontrol.repository;

import com.example.managementsystem.accountingcontrol.entity.CardUsage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardUsageRepository extends JpaRepository<CardUsage, Integer>
{
}
