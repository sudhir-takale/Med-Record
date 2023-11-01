package com.java.medrecord.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.medrecord.entity.Appointment;
import java.util.List;
import java.util.Optional;


public interface AppointmentRepositery extends JpaRepository<Appointment, Integer>{

}
