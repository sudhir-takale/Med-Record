package com.java.medrecord.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.medrecord.entity.Patient;
import com.java.medrecord.services.PatientServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value = "/patient", method = RequestMethod.GET)
public class PatientHandler {

	@Autowired
	private PatientServices patientServices;

	@PostMapping("/create-patient")
	public ResponseEntity<Patient> createPatient(@RequestBody Patient patient) {

		if (this.patientServices.createPatient(patient)) {
			return ResponseEntity.status(HttpStatus.CREATED).build();
		} else {

			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
		}

	}

	@GetMapping("/dashboard")
	public String home() {
		return "patient/dashboard";
	}

	@PostMapping("/makeappointment")
	public void appointmentRequest() {

	}

	@DeleteMapping("/deleteappointment")
	public void deleteAppointment() {

	}

	@GetMapping("/showappointments")

	public void viewAppointments() {

	}

	@PostMapping
	public void updateAppointment() {

	}

	@PostMapping("/setReminder")
	public void setReminder() {

	}

}
