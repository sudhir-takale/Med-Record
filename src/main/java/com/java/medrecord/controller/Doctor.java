package com.java.medrecord.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.medrecord.entity.Appointment;
import com.java.medrecord.services.AppointmentServices;

@Controller
@RequestMapping(value = "/doctor", method = RequestMethod.GET)
public class Doctor {

	@Autowired
	AppointmentServices appointmentServices;
	
	@GetMapping("/dashboard")
    public String home() {
        return "doctor/dashboard1";
    }

    @GetMapping("/signup")
    public String register() {
        return "doctor/registration";

    }
    
    @GetMapping("/appointments")
    public String showAppointmentsPage(Model model) {
        
    	List<Appointment> appointments=appointmentServices.getAllAppointments();
        
        model.addAttribute("appointments", appointments);

        return "doctor/appointment";
    }
    
    @GetMapping("/edit-appointment")
    public String editAppointment()
    {
    	return "/doctor/editAppointment";
    }
    

}
