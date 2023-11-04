package com.java.medrecord.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.medrecord.dao.AppointmentRepositery;
import com.java.medrecord.entity.Appointment;
import com.java.medrecord.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping(value = "/patient", method = RequestMethod.GET)
public class Patient {

    @Autowired
    private AppointmentRepositery appointmentRepository;

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

    @PostMapping()
    public String validateUser(@RequestParam User user, BindingResult result) {

        if (result.hasErrors()) {

            return "patient/register";
        }

        return "patient/dashboard";

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
