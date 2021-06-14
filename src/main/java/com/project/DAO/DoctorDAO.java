package com.project.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.project.api.Doctor;

public class DoctorDAO {
	@Autowired
	static
	JdbcTemplate jdbc ;

	public static String addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		
		int records =jdbc.update("insert into doctor (firstName,lastName,location,aadharCard,qualification,availableTime) values (?,?,?,?,?,?)",doctor.getFirstName(),doctor.getLastname(),doctor.getLocation(),doctor.getAadharCard(),doctor.getQualification(),doctor.getAvailableTime());
	if(records>0) {
		return "doctor added successfully";
	}else {
		return "error";
	}

	}
	
}
