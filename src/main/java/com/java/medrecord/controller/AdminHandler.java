package com.java.medrecord.controller;

import com.java.medrecord.services.impl.AdminServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping("/admin")
public class AdminHandler {

	@Autowired
	AdminServicesImpl adminServicesImpl;

	@GetMapping("/")
	@ResponseBody
	public void viewAllRequest() {

		this.adminServicesImpl.pendingPatientRequest("disable");
		this.adminServicesImpl.pendingDoctorRequest();
		System.out.println("Admin started");

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
