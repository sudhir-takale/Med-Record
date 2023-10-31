package com.java.medrecord.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.medrecord.dao.AppointmentRepositery;
import com.java.medrecord.entity.Appointment;

@Service
public class AppointmentServices {

	@Autowired
	AppointmentRepositery appointmentRepositery;
	
	public List<Appointment> getAllAppointments() {
		return appointmentRepositery.findAll();
	}
}
