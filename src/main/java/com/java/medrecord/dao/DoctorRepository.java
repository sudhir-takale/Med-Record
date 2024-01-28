package com.java.medrecord.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.medrecord.controller.Doctor;


public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
