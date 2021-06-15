package com.project.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.project.api.Patient;

public class PatientDAO {
	@Autowired
	JdbcTemplate jdbc;

	public String addpatient(Patient patient) {
		// TODO Auto-generated method stub

		int records = jdbc.update(
				"insert into patient (username,password, firstName,lastName,aadhaar,location,bookedDoctor,date,phoneNumber) values (?,?,?,?,?,?,?,?,?)",
				patient.getUsername(), patient.getPassword(), patient.getFirstName(), patient.getLastName(),
				patient.getAadhaar(), patient.getLocation(), patient.getBookedDoctor(), patient.getDate(),
				patient.getPhoneNumber());
		if (records > 0) {
			return "patient added successfully";
		} else {
			return "error";
		}
	}
//
//	public String updateVaccineStatus(patient patient) {
//		int records = jdbc.update(
//				"update patient set vaccineStatus = ? WHERE aadharCard = ?",
//				patient.setVaccineStatus(updateVaccineStatus(patient))))
//if(reco)
//return "status updated successfully";
//	}else
//
//	{
//		return "error";
//	}

}
