package com.java.medrecord.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping(value = "/patient", method = RequestMethod.GET)
public class Patient {

    @GetMapping(value = "/")
    public String home() {
        return "patientHomePage";
    }

}
