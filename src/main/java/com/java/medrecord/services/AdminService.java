package com.java.medrecord.services;

import java.util.List;

import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;

import com.java.medrecord.controller.Doctor;
import com.java.medrecord.entity.Patient;

public interface AdminService {

	public List<Patient> pendingPatientRequest();

	public List<Doctor> pendingDoctorRequest();

	public void approvePatient(Long id);

	public void approveDoctor(Long id);

	public void  denyPatient(Long id);

	public void denyDoctor(Long id);

}
