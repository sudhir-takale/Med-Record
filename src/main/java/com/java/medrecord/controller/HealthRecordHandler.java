package com.java.medrecord.controller;

import com.java.medrecord.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.java.medrecord.services.impl.HealthRecordImpl;

@RestController
@RequestMapping("/health-record")
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

	@GetMapping("/view-history")
	public void viewHistory() {

		this.healthRecordImpl.viewHistory();

	}

	// functionality to give access to other doctors
	@PostMapping("/grant-access")
	public void grantAccess() {
		this.healthRecordImpl.giveAccess();
	}

	// functionality to remove access

	@PostMapping("/revoke-access")
	public void revokeAccess() {

		this.healthRecordImpl.revokeAccess();

	}

	@PutMapping("/add-record")
	public void addNewData() {

		this.healthRecordImpl.addNewRecord();

	}


	// to add family history
	@PutMapping("/add-familyhistory")
	public void addFamilyHistory(@RequestBody FamilyHistory familyHistory) {



	}


	// to add emergency contact information

	@PutMapping("/emergency-contact")
	public void addEmergencyContact(@RequestBody EmergencyContact emergencyContact) {


	}

	// TO ADD medications

	@PutMapping("/medication")
	public void addMedication(@RequestBody Medication medication){

	}

	//to add new health goals for that specific appointment

	@PutMapping("/health-goal")
	public void addHealthGoals(@RequestBody HealthGoals healthGoals){

	}

	//To create emergency alerts for that specific health record
	@PutMapping("/create-alert")
	public void crateEmergencyAlert(@RequestBody EmergencyAlert emergencyAlert) {

	}



}
