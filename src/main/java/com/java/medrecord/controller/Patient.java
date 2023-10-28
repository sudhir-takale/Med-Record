package com.java.medrecord.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping(value = "/patient", method = RequestMethod.GET)
public class Patient {

    @GetMapping("/")
    public String home() {
        return "patient/patientHomePage";
    }

    @GetMapping("/signup")
    public String register() {
        return "patient/registration";

    }

}
