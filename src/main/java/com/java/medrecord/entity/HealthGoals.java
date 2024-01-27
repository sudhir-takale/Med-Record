package com.java.medrecord.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "health_goals")
public class HealthGoals {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
//	@ManyToOne
//	@JoinColumn(name = "patient_id", nullable = false)
//	private Patient patient;

	private String goalType;
	private String goalDescription;
	private String targetDate;
	private boolean goalAchieved;

	public HealthGoals() {

	}

	public HealthGoals(String goalType, String goalDescription, String targetDate, boolean goalAchieved) {
		super();
		this.goalType = goalType;
		this.goalDescription = goalDescription;
		this.targetDate = targetDate;
		this.goalAchieved = goalAchieved;
	}

	public String getGoalType() {
		return goalType;
	}

	public void setGoalType(String goalType) {
		this.goalType = goalType;
	}

	public String getGoalDescription() {
		return goalDescription;
	}

	public void setGoalDescription(String goalDescription) {
		this.goalDescription = goalDescription;
	}

	public String getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(String targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isGoalAchieved() {
		return goalAchieved;
	}

	public void setGoalAchieved(boolean goalAchieved) {
		this.goalAchieved = goalAchieved;
	}

}
