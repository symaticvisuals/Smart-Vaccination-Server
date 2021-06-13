package com.project.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.project.api.User;

public class UserDAO1 {
	@Autowired
	JdbcTemplate jdbc ;

	public String addUser(User user) {
		// TODO Auto-generated method stub
		
		int records =jdbc.update("insert into user (firstName,lastName,age,aadharCard,doseNumber,starTime,endTime,doctorName,vaccineStatus,vaccineName) values (?,?,?,?,?,?,?,?,?,?)",user.getFirstName(),user.getLastname(),user.getAge(),user.getAadharCard(),user.getDoseNumber(),user.getStartTime(),user.getEndTime(),user.getDoctorName(),user.getVaccineStatus(),user.getVaccineName());
	if(records>0) {
		return "user added successfully";
	}else {
		return "error";
	}

	
	
	}

	
}
