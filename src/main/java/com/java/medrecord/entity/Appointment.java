package com.java.medrecord.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "appointment")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String date;
    private String time;
    private String purpose;
    private Long doctorid;
    private String status;
    private String note;

    public Appointment() {

    }

    public Appointment(Long id, String patientName, String date, String time, String purpose, String status,
            String note) {
        super();
        this.id = id;
        this.username = patientName;
        this.date = date;
        this.time = time;
        this.purpose = purpose;
        this.status = status;
        this.note = note;
    }

    public String getUsername() {
        return username;
    }

    public Long getDoctorid() {
        return doctorid;
    }

    public Long getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDoctorid(Long doctorid) {
        this.doctorid = doctorid;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPatientName() {
        return username;
    }

    public void setPatientName(String patientName) {
        this.username = patientName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
