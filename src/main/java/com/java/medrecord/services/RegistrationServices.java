package com.java.medrecord.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.java.medrecord.dao.DoctorRepository;
import com.java.medrecord.entity.DoctorEntity;

@Service
public class RegistrationServices {
	
	@Autowired
	DoctorRepository doctorRepository;
	
	
	public String saveDoctorData(int doctorid,String doctorName,String phoneNo,String email,String password,String speciality,String gender,String bloodGroup,int age,String address)
	{
		DoctorEntity doctorEntity=new DoctorEntity(doctorid, doctorName, phoneNo, email, password, speciality, gender, bloodGroup, age, address);
		doctorRepository.save(doctorEntity);
		return "";
	}
}
