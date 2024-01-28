package com.java.medrecord;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.java.medrecord.dao"})
public class MedrecordApplication {
	public static void main(String[] args) {
		
		SpringApplication.run(MedrecordApplication.class, args);
		System.out.println("Project run Successfully");
	
	}

}
