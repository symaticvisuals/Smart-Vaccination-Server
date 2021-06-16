package com.project.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.DAO.PatientDAO;
import com.project.api.Patient;

@RestController
public class UserController {

	@Autowired
	private PatientDAO patientDao;

	@RequestMapping(path = "/registerpatient", method = RequestMethod.POST)
	public String addpatient(Patient patient) {
		return patientDao.addpatient(patient);

	}
	@RequestMapping(path = "/loginpatient", method = RequestMethod.POST)
	public String loginpatient(Patient patient) {
		return patientDao.addpatient(patient);

	}	

}
