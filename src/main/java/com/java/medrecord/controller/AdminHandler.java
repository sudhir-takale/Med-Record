package com.java.medrecord.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.java.medrecord.services.impl.AdminServicesImpl;



@RestController
@RequestMapping("/admin")
public class AdminHandler {

	@Autowired
	AdminServicesImpl adminServicesImpl;

	@GetMapping("/")
	public void viewAllRequest() {

		this.adminServicesImpl.pendingPatientRequest();
		this.adminServicesImpl.pendingDoctorRequest();

	}

	@PostMapping("/approve-patient/{id}")
	public void approvePatient(@PathVariable("id") Long id) {
		this.adminServicesImpl.approvePatient(id);

	}

	@PostMapping("/approve-doctor/{id}")
	public void approveDoctor(@PathVariable("id") Long id) {
		this.adminServicesImpl.approveDoctor(id);

	}

	@DeleteMapping("/denied-patient/{id}")
	public void denyPatient(@PathVariable("id") Long id) {
		this.adminServicesImpl.denyPatient(id);

	}

	@DeleteMapping("/denied-doctor{id}")
	public void denyDoctor(@PathVariable("id") Long id) {

		this.adminServicesImpl.denyDoctor(id);
	}

}
