package com.java.medrecord.services;


import com.java.medrecord.entity.Appointment;
import com.java.medrecord.exception.AppointmentNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface AppointmentService {


    public void setAppointment(Appointment appointment);
//    public Appointment getAppointmentById(Long id);

    public List<Appointment> getAllAppointment() throws AppointmentNotFoundException;

    public Appointment updateAppointment(Appointment appointment, Long id);
    public void deleteAppointment(Long id);




}
