package com.java.medrecord.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.medrecord.entity.Doctor;


public interface DoctorRepository extends JpaRepository<Doctor, Long> {


}
