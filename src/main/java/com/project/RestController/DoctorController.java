package com.project.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.DAO.DoctorDAO;
import com.project.api.Doctor;

@RestController
public class DoctorController {

	@Autowired
	private DoctorDAO doctorDao;

	@RequestMapping(path = "/adddoctor", method = RequestMethod.POST)
	public String addDoctor(Doctor doctor) {
		return DoctorDAO.addDoctor(doctor);

	}

}
