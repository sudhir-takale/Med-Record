package com.java.medrecord.dao;


import com.java.medrecord.entity.FamilyHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamilyHistoryRepository extends JpaRepository<FamilyHistory, Long> {
}
