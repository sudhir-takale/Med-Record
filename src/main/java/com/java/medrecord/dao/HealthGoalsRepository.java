package com.java.medrecord.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.medrecord.entity.HealthGoals;

public interface HealthGoalsRepository extends JpaRepository<HealthGoals, Long> {

}
