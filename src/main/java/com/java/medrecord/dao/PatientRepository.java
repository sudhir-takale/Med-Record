package com.java.medrecord.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.java.medrecord.entity.Patient;



public interface PatientRepository extends JpaRepository<Patient, Long>{

}
