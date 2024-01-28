package com.java.medrecord.services.impl;

import com.java.medrecord.dao.DoctorRepository;
import com.java.medrecord.dao.PatientRepository;
import com.java.medrecord.entity.Doctor;
import com.java.medrecord.entity.Patient;
import com.java.medrecord.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AdminServicesImpl implements AdminService {
	
   
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public List<Patient> pendingPatientRequest(String status) {

//if(patientRepository.findByStatus(status))

        return patientRepository.findAll();

    }

    @Override
    public List<Doctor> pendingDoctorRequest() {


        // Fetch all records from the Doctor repository
        return doctorRepository.findAll();

        // Add all fetched doctors to the list
    }

    @Override
    public void approvePatient(Long id) {

        Optional<Patient> optionalPatient = patientRepository.findById(id);

        // Check if the doctor with the given ID exists
        if (optionalPatient.isPresent()) {
            Patient patient = optionalPatient.get();

            // Update the status to 'enable'
            patient.setStatus("enable");

            // Save the updated doctor
            patientRepository.save(patient);

            // Return a response indicating success
        }
//         If the doctor with the given ID is not found, return a 404 Not Found response

    }

    @Override
    public void approveDoctor(Long id) {
//        Optional<Doctor> optionalDoctor = doctorRepository.findById(id);
//
//        // Check if the doctor with the given ID exists
//        if (optionalDoctor.isPresent()) {
//            Doctor doctor = optionalDoctor.get();
//
//            // Update the status to 'enable'
//            doctor.setStatus("enable");
//
//            // Save the updated doctor
//            doctorRepository.save(doctor);
//
//            // Return a response indicating success
//        }
//         If the doctor with the given ID is not found, return a 404 Not Found response


    }

    @Override
    public void denyPatient(Long id) {
        patientRepository.deleteById(id);

    }

    @Override
    public void denyDoctor(Long id) {
        doctorRepository.deleteById(id);
    }

}


