package com.java.medrecord.entity;

import java.util.List;
//import java.util.Map;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class HealthRecord {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String dateTime;
	private String medicalHistory;
	private List<Medication> medications;
	private String allergies;
	private String lifestyleFactors;
//	private Map<String, Double> vitalSigns;
//	private Map<String, Integer> fitnessMetrics;
//	private Map<String, Integer> sleepPatterns;
	private List<Symptom> symptoms;
//	private Map<String, Integer> dietaryTracking;
//	private Map<String, Integer> mentalHealthInfo;
	private List<HealthGoals> healthGoals;
//	private Map<String, String> emergencyAlerts;
//	private Map<String, FamilyHistory> familyHealthHistory;
//	private List<Feedback> feedbackNotes;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "patient_id")
	private Patient patient;

	public HealthRecord() {

	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getMedicalHistory() {
		return medicalHistory;
	}

	public void setMedicalHistory(String medicalHistory) {
		this.medicalHistory = medicalHistory;
	}

	public List<Medication> getMedications() {
		return medications;
	}

	public void setMedications(List<Medication> medications) {
		this.medications = medications;
	}

	public String getAllergies() {
		return allergies;
	}

	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}

	public String getLifestyleFactors() {
		return lifestyleFactors;
	}

	public void setLifestyleFactors(String lifestyleFactors) {
		this.lifestyleFactors = lifestyleFactors;
	}

//	public Map<String, Double> getVitalSigns() {
//		return vitalSigns;
//	}
//
//	public void setVitalSigns(Map<String, Double> vitalSigns) {
//		this.vitalSigns = vitalSigns;
//	}
//
//	public Map<String, Integer> getFitnessMetrics() {
//		return fitnessMetrics;
//	}
//
//	public void setFitnessMetrics(Map<String, Integer> fitnessMetrics) {
//		this.fitnessMetrics = fitnessMetrics;
//	}
//
//	public Map<String, Integer> getSleepPatterns() {
//		return sleepPatterns;
//	}
//
//	public void setSleepPatterns(Map<String, Integer> sleepPatterns) {
//		this.sleepPatterns = sleepPatterns;
//	}

	public List<Symptom> getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(List<Symptom> symptoms) {
		this.symptoms = symptoms;
	}

//	public Map<String, Integer> getDietaryTracking() {
//		return dietaryTracking;
//	}
//
//	public void setDietaryTracking(Map<String, Integer> dietaryTracking) {
//		this.dietaryTracking = dietaryTracking;
//	}
//
//	public Map<String, Integer> getMentalHealthInfo() {
//		return mentalHealthInfo;
//	}
//
//	public void setMentalHealthInfo(Map<String, Integer> mentalHealthInfo) {
//		this.mentalHealthInfo = mentalHealthInfo;
//	}

	public List<HealthGoals> getHealthGoals() {
		return healthGoals;
	}

	public void setHealthGoals(List<HealthGoals> healthGoals) {
		this.healthGoals = healthGoals;
	}

//	public Map<String, String> getEmergencyAlerts() {
//		return emergencyAlerts;
//	}
//
//	public void setEmergencyAlerts(Map<String, String> emergencyAlerts) {
//		this.emergencyAlerts = emergencyAlerts;
//	}
//
//	public Map<String, FamilyHistory> getFamilyHealthHistory() {
//		return familyHealthHistory;
//	}
//
//	public void setFamilyHealthHistory(Map<String, FamilyHistory> familyHealthHistory) {
//		this.familyHealthHistory = familyHealthHistory;
//	}

//	public List<Feedback> getFeedbackNotes() {
//		return feedbackNotes;
//	}
//
//	public void setFeedbackNotes(List<Feedback> feedbackNotes) {
//		this.feedbackNotes = feedbackNotes;
//	}

}
