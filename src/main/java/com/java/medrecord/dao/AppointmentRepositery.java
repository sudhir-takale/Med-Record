package com.java.medrecord.dao;

import com.java.medrecord.entity.Appointment;


import org.springframework.data.jpa.repository.JpaRepository;


public interface AppointmentRepositery extends JpaRepository<Appointment, Integer>{

}
