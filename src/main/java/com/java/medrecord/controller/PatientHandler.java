package com.java.medrecord.controller;

import com.java.medrecord.entity.Appointment;
import com.java.medrecord.entity.Patient;
import com.java.medrecord.services.AppointmentService;
import com.java.medrecord.services.PatientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/patient", method = RequestMethod.GET)
public class PatientHandler {

    @Autowired
    private PatientServices patientServices;
    @Autowired
    private AppointmentService appointmentService;

    @PostMapping("/create-patient")
    public ResponseEntity<Patient> createPatient(@RequestBody Patient patient) {

        if (this.patientServices.createPatient(patient)) {
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } else {

            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
        }

    }

    @GetMapping("/dashboard")
    public String home() {
        return "patient/dashboard";
    }

    @PostMapping("/makeappointment")
    public void appointmentRequest(@RequestBody Appointment appointment) {

        this.appointmentService.setAppointment(appointment);
    }
    @DeleteMapping("/delete-appointment/{id}")
    public void deleteAppointment(@PathVariable Long id) {

        this.appointmentService.deleteAppointment(id);
    }

    @GetMapping("/appointments")

    public void viewAppointments() {

        this.appointmentService.getAllAppointment();
    }

    @PostMapping("/update-appointment/{id}")
    public void updateAppointment(@PathVariable Appointment appointment, Long id) {
        this.appointmentService.updateAppointment(appointment, id);
    }




}
