package com.project.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.project.api.Doctor;

public class DoctorDAO {
	@Autowired
	static
	JdbcTemplate jdbc ;

	public String addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		
		int records = jdbc.update(
				"insert into doctor (username, password, firstName,lastName,aadhaar,location,availableSlot, email, phoneNumber) values (?,?,?,?,?,?,?,?,?)",
				doctor.getUsername(), doctor.getPassword(), doctor.getFirstName(), doctor.getLastName(),
				doctor.getAadhaar(), doctor.getLocation(), doctor.getAvailableSlots(), doctor.getEmail(),
				doctor.getPhoneNumber());
		if(records>0) {
		return "doctor added successfully";
	}else {
		return "error";
	}

	}
	
}
