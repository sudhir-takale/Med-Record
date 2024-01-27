package com.java.medrecord.controller;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import com.java.medrecord.dao.DoctorRepository;
//import com.java.medrecord.dao.PatientRepository;

@Controller
public class LoginController {

//	@Autowired
//	DoctorRepository doctorRepository;
//	
//	@Autowired
//	PatientRepository patientRepository;
//	
//	
    @GetMapping("/login")
    public String loggedin() {
        return "login";
    }

    @PostMapping("/processlogin")
    public String login(Model model, @RequestParam String email, @RequestParam String password) {
        if (email.length() < 7) {
            model.addAttribute("message", "login is not successfull");
            return "login";
        }
        if (isValidUser(email, password)) {
            model.addAttribute("message", "Login successful!");
        } else {
            model.addAttribute("error", "Invalid credentials. Please try again.");
        }

        return "redirect:/patient/dashboard";
    }

    private boolean isValidUser(String email, String password) {
        // Your authentication logic goes here
        // Return true if the user is valid, otherwise return false
    	
    	
    	
    	
        return true; 
    }
}
