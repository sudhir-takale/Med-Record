package com.java.medrecord.entity;

public class Medication {

	private String name;
    private String dosage;
    private String frequency;
    private String startDate;
    private String endDate;
    private String prescribingDoctor;
    private String instructions;
    
    
    Medication(){}
    
	public Medication(String name, String dosage, String frequency, String startDate, String endDate,
			String prescribingDoctor, String instructions) {
		super();
		this.name = name;
		this.dosage = dosage;
		this.frequency = frequency;
		this.startDate = startDate;
		this.endDate = endDate;
		this.prescribingDoctor = prescribingDoctor;
		this.instructions = instructions;
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDosage() {
		return dosage;
	}
	public void setDosage(String dosage) {
		this.dosage = dosage;
	}
	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getPrescribingDoctor() {
		return prescribingDoctor;
	}
	public void setPrescribingDoctor(String prescribingDoctor) {
		this.prescribingDoctor = prescribingDoctor;
	}
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
    
	
    
    
    
    
    
}
