package com.java.medrecord.exception;

public class AppointmentNotFoundException extends RuntimeException {
    public AppointmentNotFoundException(String s) {

        super(s);
    }
}
