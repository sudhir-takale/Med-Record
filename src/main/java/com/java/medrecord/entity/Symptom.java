package com.java.medrecord.entity;

import java.time.LocalDate;

public class Symptom {
	
	 	private int symptomID;
	    private int patientID;
	    private String symptomName;
	    private String description;
	    private LocalDate onsetDateTime;
	    private String severityLevel;
	    private String duration;
	    private String associatedConditions;
	    private String medicationsTaken;
	    private String treatmentActions;
	    private String notes;
	    private String status;
	    
	    
	    
	    public Symptom() {
			
		}
	    
	    
	    
	    
		public int getSymptomID() {
			return symptomID;
		}
		public void setSymptomID(int symptomID) {
			this.symptomID = symptomID;
		}
		public int getPatientID() {
			return patientID;
		}
		public void setPatientID(int patientID) {
			this.patientID = patientID;
		}
		public String getSymptomName() {
			return symptomName;
		}
		public void setSymptomName(String symptomName) {
			this.symptomName = symptomName;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public LocalDate getOnsetDateTime() {
			return onsetDateTime;
		}
		public void setOnsetDateTime(LocalDate onsetDateTime) {
			this.onsetDateTime = onsetDateTime;
		}
		public String getSeverityLevel() {
			return severityLevel;
		}
		public void setSeverityLevel(String severityLevel) {
			this.severityLevel = severityLevel;
		}
		public String getDuration() {
			return duration;
		}
		public void setDuration(String duration) {
			this.duration = duration;
		}
		public String getAssociatedConditions() {
			return associatedConditions;
		}
		public void setAssociatedConditions(String associatedConditions) {
			this.associatedConditions = associatedConditions;
		}
		public String getMedicationsTaken() {
			return medicationsTaken;
		}
		public void setMedicationsTaken(String medicationsTaken) {
			this.medicationsTaken = medicationsTaken;
		}
		public String getTreatmentActions() {
			return treatmentActions;
		}
		public void setTreatmentActions(String treatmentActions) {
			this.treatmentActions = treatmentActions;
		}
		public String getNotes() {
			return notes;
		}
		public void setNotes(String notes) {
			this.notes = notes;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
	    
	    
	    
}
