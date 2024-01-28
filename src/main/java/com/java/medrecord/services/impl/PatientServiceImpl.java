package com.java.medrecord.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.java.medrecord.dao.PatientRepository;
import com.java.medrecord.entity.Patient;
import com.java.medrecord.services.PatientServices;

public class PatientServiceImpl implements PatientServices {

	@Autowired
	private PatientRepository patientRepository;

	@Override
	public boolean createPatient(Patient patient) {
		try {
			patientRepository.save(patient);
			return true; // Successfully created and saved the patient
		} catch (Exception e) {
			// Handle exceptions or log errors if the save operation fails
			return false; // Failed to create and save the patient
		}
	}

}
