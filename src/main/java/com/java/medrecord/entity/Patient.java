package com.java.medrecord.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String patientname;
    private String username;
    private String phoneno;
    private String email;
    private String password;
    private String gender;
    private String bloodgroup;
    private int age;
    private String address;

    public Patient() {
    }

    public Patient(String patientname, String username, String phoneno, String email, String password, String gender,
            String bloodgroup, int age, String address) {
        this.patientname = patientname;
        this.username = username;
        this.phoneno = phoneno;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.bloodgroup = bloodgroup;
        this.age = age;
        this.address = address;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPatientname() {
        return patientname;
    }

    public String getUsername() {
        return username;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    };

}
