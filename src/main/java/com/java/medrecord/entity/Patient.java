package com.java.medrecord.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String patientName;
    private String username;
    private String phoneno;
    private String email;
    private String password;
    private String gender;
    private String bloodgroup;
    private int age;
    private String address;
    private String status;

//    @OneToMany(mappedBy = "patient")
//    private List<HealthGoals> healthGoalsList = new ArrayList<>();

    @OneToOne(mappedBy = "patient", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private HealthRecord healthRecord;


    public Patient() {
    }

    public Patient(String patientName, String username, String phoneno, String email, String password, String gender,
                   String bloodgroup, int age, String address) {
        this.patientName = patientName;
        this.username = username;
        this.phoneno = phoneno;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.bloodgroup = bloodgroup;
        this.age = age;
        this.address = address;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhoneno() {
        return phoneno;
    }

    ;

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
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

    ;

}
