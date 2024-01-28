package com.java.medrecord.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.medrecord.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long>{

}
