package com.project.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.DAO.PatientDAO;
import com.project.api.Patient;

@RestController
public class PatientController {

	@Autowired
	private PatientDAO patientDao;

	@RequestMapping(value = "/addpatient", method = RequestMethod.POST)
	public String addpatient(Patient patient) {
		return patientDao.addpatient(patient);

	}

}
