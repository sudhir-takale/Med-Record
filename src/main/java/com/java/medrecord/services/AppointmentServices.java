package com.java.medrecord.services;

//import java.util.List;
import org.springframework.stereotype.Service;


//import com.java.medrecord.dao.AppointmentRepository;
//import com.java.medrecord.entity.Appointment;

@Service
public class AppointmentServices {

<<<<<<< HEAD
	@Autowired
	AppointmentRepositery appointmentRepositery;
	
	public List<Appointment> getAllAppointments() {
		return appointmentRepositery.findAll();
	}
	

	public Appointment updateAppointment(int id, String newDate, String newTime) {
        Optional<Appointment> optionalAppointment = appointmentRepositery.findById(id);
        if (optionalAppointment.isPresent()) {
            Appointment appointment = optionalAppointment.get();
            appointment.setDate(newDate);
            appointment.setTime(newTime);
            return appointmentRepositery.save(appointment);
        }
        return null;
    }
=======
////	@Autowired
//	AppointmentRepository appointmentRepository;
//	
//	public List<Appointment> getAllAppointments() {
//		return appointmentRepository.findAll();
//	}
//	
//
//	public Appointment updateAppointment(int id, String newDate, String newTime) {
//        Optional<Appointment> optionalAppointment = appointmentRepository.findById(id);
//        if (optionalAppointment.isPresent()) {
//            Appointment appointment = optionalAppointment.get();
//            appointment.setDate(newDate);
//            appointment.setTime(newTime);
//            return appointmentRepository.save(appointment);
//        }
//        return null; // Handle not found scenario
//    }
>>>>>>> 22fa7d344e8ce51bc797d43985a7d79a05182811
}
