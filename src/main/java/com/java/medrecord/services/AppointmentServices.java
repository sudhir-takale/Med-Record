package com.java.medrecord.services;

import java.util.List;
import java.util.Optional;

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
	
	
	public Appointment updateAppointment(int id, String newDate, String newTime) {
        Optional<Appointment> optionalAppointment = appointmentRepositery.findById(id);
        if (optionalAppointment.isPresent()) {
            Appointment appointment = optionalAppointment.get();
            appointment.setDate(newDate);
            appointment.setTime(newTime);
            return appointmentRepositery.save(appointment);
        }
        return null; // Handle not found scenario
    }
}
