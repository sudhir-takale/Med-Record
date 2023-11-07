package com.java.medrecord.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.java.medrecord.dao.AppointmentRepositery;
import com.java.medrecord.dao.PatientRepository;
import com.java.medrecord.entity.Appointment;
import com.java.medrecord.entity.Patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping(value = "/patient", method = RequestMethod.GET)
public class PatientHandler {

    @Autowired
    private AppointmentRepositery appointmentRepository;
    @Autowired
    private PatientRepository patientRepository;

    @GetMapping("/dashboard")
    public String home() {
        return "patient/dashboard";
    }

    @GetMapping("/")
    public String dashboard() {
        return "patient/dashboard";
    }

    @GetMapping("/register")
    public String registering() {
        return "patient/register";

    }
    
    @GetMapping("/history")
    public String history() {
        return "patient/history";

    }

    @PostMapping("process")
    public String validateUser(@ModelAttribute Patient patient, BindingResult result) {

        if (result.hasErrors()) {

            return "patient/register";
        } else {
            patientRepository.save(patient);
            return "redirect:/patient/dashboard";

        }
    }

    @GetMapping("/appointmentrequest")
    public String submitForm(@ModelAttribute Appointment appointment) {
        return "patient/createappointment";
    }

    @PostMapping("/submit-appointment")
    public String submitAppointment(@ModelAttribute @Validated Appointment appointment, BindingResult result) {
        if (result.hasErrors()) {
            return "patient/createappointment";
        }

        appointmentRepository.save(appointment);
        return "redirect:patient/dashboard";
    }

}
