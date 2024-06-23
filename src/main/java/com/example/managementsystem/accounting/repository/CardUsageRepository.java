package com.example.managementsystem.accounting.repository;

import com.example.managementsystem.accounting.entity.CardUsage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CardUsageRepository extends JpaRepository<CardUsage, String>
{
    List<CardUsage> findByExecutionDetail_CardNum(String cardNum);
    @Query("SELECT e FROM CardUsage e WHERE e.useDate BETWEEN :startDate AND :endDate AND (e.useId LIKE %:keyword% OR e.usePlace LIKE %:keyword% OR CAST(e.useCost AS string) LIKE %:keyword%)")
    List<CardUsage> findByDateAndKeyword(LocalDate startDate, LocalDate endDate, String keyword);
}
