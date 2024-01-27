package com.java.medrecord.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "doctors")
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long doctorid;
	private String doctorName;
	private String phoneNo;
	private String email;
	private String password;
	private String speciality;
	private String gender;
	private String bloodGroup;
	private int age;
	private String address;
	
	public Doctor() {
		
	}
	
	
	public Doctor(Long doctorid, String doctorName, String phoneNo, String email, String password,
			String speciality, String gender, String bloodGroup, int age, String address) {
		super();
		this.doctorid = doctorid;
		this.doctorName = doctorName;
		this.phoneNo = phoneNo;
		this.email = email;
		this.password = password;
		this.speciality = speciality;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
		this.age = age;
		this.address = address;
	}


	public Long getDoctorid() {
		return doctorid;
	}


	public void setDoctorid(Long doctorid) {
		this.doctorid = doctorid;
	}


	public String getDoctorName() {
		return doctorName;
	}


	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}


	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getSpeciality() {
		return speciality;
	}


	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getBloodGroup() {
		return bloodGroup;
	}


	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
