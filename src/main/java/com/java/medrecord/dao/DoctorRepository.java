package com.java.medrecord.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.medrecord.entity.DoctorEntity;

public interface DoctorRepository extends JpaRepository<DoctorEntity, Integer> {

}
