package com.java.medrecord.services.impl;

import com.java.medrecord.dao.AppointmentRepository;
import com.java.medrecord.entity.Appointment;
import com.java.medrecord.exception.AppointmentNotFoundException;
import com.java.medrecord.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    Appointment appointment;
    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public void setAppointment(Appointment appointment) {

        appointmentRepository.save(appointment);
    }

//    @Override
//    public Appointment getAppointmentById(Long id) {
//
//        if (appointmentRepository.findById(id).isEmpty()) {
//
//            throw new AppointmentNotFoundException(appointment.getId() + "Appointment Not found!");
//
//        }
//
//        return null;
//
//
//    }

    @Override
    public List<Appointment> getAllAppointment() throws AppointmentNotFoundException {

        if (appointmentRepository.findAll().isEmpty()) {
            throw new AppointmentNotFoundException("Appointment Not found!");
        }

        return appointmentRepository.findAll();
    }

    @Override
    public Appointment updateAppointment(Appointment appointment, Long id) {
        return null;


    }

    @Override
    public void deleteAppointment(Long id) {

        appointmentRepository.deleteById(id);


    }
}
