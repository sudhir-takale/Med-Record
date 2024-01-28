package com.java.medrecord.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.java.medrecord.controller.Doctor;
import com.java.medrecord.dao.DoctorRepository;
import com.java.medrecord.dao.PatientRepository;

import com.java.medrecord.entity.Patient;
import com.java.medrecord.services.AdminService;



@Service
public class AdminServicesImpl implements AdminService {

	@Autowired
	PatientRepository patientRepository; // Uncomment this line
	@Autowired
	private DoctorRepository doctorRepository;

	@Override
	public List<Patient> pendingPatientRequest() {

		return  patientRepository.findAll();



	}

	@Override
	public List<Doctor> pendingDoctorRequest() {

		// Fetch all records from the Doctor repository
		return doctorRepository.findAll();

		// Add all fetched doctors to the list
	}

	@Override
	public void approvePatient(Long patientid) {


	}

	@Override
	public void approveDoctor(Long id) {

//		Optional<Doctor> optionalDoctor = doctorRepository.findById(id);
//
//		// Check if the doctor with the given ID exists
//		if (optionalDoctor.isPresent()) {
//			Doctor doctor = optionalDoctor.get();
//
//			// Update the status to 'enable'
//			doctor.setStatus("enable");
//
//			// Save the updated doctor
//			doctorRepository.save(doctor);
//
//			// Return a response indicating success
//			return ResponseEntity.ok(doctor);
//		} else {
			// If the doctor with the given ID is not found, return a 404 Not Found response

//		}

	}

	@Override
	public void denyPatient(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void denyDoctor(Long id) {
		// TODO Auto-generated method stub

	}

}
