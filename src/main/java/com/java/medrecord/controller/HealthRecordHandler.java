package com.java.medrecord.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.medrecord.services.impl.HealthRecordImpl;

@RestController
@RequestMapping("/healthrecord")
public class HealthRecordHandler {

	@Autowired
	HealthRecordImpl healthRecordImpl;

	// functionality to view entire records
	@GetMapping("/")
	public void Home() {

		this.healthRecordImpl.viewHealthRecord();

	}

	// Functionality to update record

	@PutMapping("/update")
	public void UpdateRecord() {
		this.healthRecordImpl.updateHealthRecord();

	}

	// functionality to view entire history

	@GetMapping("/viewhistory")
	public void viewHistory() {

		this.healthRecordImpl.viewHistory();

	}

	// functionality to give access to other doctors
	@PostMapping("/grantaccess")
	public void grantAccess() {
		this.healthRecordImpl.giveAccess();
	}

	// functionality to remove access

	@PostMapping("/revokeaccess")
	public void revokeAccess() {

		this.healthRecordImpl.revokeAccess();

	}

	@PutMapping("/addrecord")

	public void addNewData() {

		this.healthRecordImpl.addNewRecord();

	}

}
