package com.java.medrecord.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.java.medrecord.dao.DoctorRepository;
import com.java.medrecord.entity.Doctor;

@Service
public class RegistrationServices {

	@Autowired
	DoctorRepository doctorRepository;

	public String saveDoctorData(Long doctorid, String doctorName, String phoneNo, String email, String password,
			String speciality, String gender, String bloodGroup, int age, String address) {
		Doctor doctor = new Doctor(doctorid, doctorName, phoneNo, email, password, speciality, gender, bloodGroup, age,
				address);
		doctorRepository.save(doctor);
		return "";
	}
}
