package com.java.medrecord.entity;

import java.util.List;

public class FamilyHistory {
	
	
	private String familyMemberName;
    private String relationship;
    private List<String> medicalConditions;
    private String currentHealthStatus;
    private String causeOfDeath;
    private List<String> geneticConditions;
    
    
    
 public FamilyHistory() {}
    
    
	public FamilyHistory(String familyMemberName, String relationship, List<String> medicalConditions,
			String currentHealthStatus, String causeOfDeath, List<String> geneticConditions) {
		super();
		this.familyMemberName = familyMemberName;
		this.relationship = relationship;
		this.medicalConditions = medicalConditions;
		this.currentHealthStatus = currentHealthStatus;
		this.causeOfDeath = causeOfDeath;
		this.geneticConditions = geneticConditions;
	}
	public String getFamilyMemberName() {
		return familyMemberName;
	}
	public void setFamilyMemberName(String familyMemberName) {
		this.familyMemberName = familyMemberName;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public List<String> getMedicalConditions() {
		return medicalConditions;
	}
	public void setMedicalConditions(List<String> medicalConditions) {
		this.medicalConditions = medicalConditions;
	}
	public String getCurrentHealthStatus() {
		return currentHealthStatus;
	}
	public void setCurrentHealthStatus(String currentHealthStatus) {
		this.currentHealthStatus = currentHealthStatus;
	}
	public String getCauseOfDeath() {
		return causeOfDeath;
	}
	public void setCauseOfDeath(String causeOfDeath) {
		this.causeOfDeath = causeOfDeath;
	}
	public List<String> getGeneticConditions() {
		return geneticConditions;
	}
	public void setGeneticConditions(List<String> geneticConditions) {
		this.geneticConditions = geneticConditions;
	}
    
    
    
    
    
 

}
