package com.java.medrecord.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class Home {
    @GetMapping("/")
    public String index() {

        return "index";

    }


   

}
