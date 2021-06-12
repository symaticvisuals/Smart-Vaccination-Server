package com.project.api;

import javax.validation.constraints.NotEmpty;

import com.project.validator.Age;

public class DoctorRegistrationDTO {

	@NotEmpty(message= "{string.notEmpty}")
	private String name;
	private String doctorname;
	public String getDoctorname() {
		return doctorname;
	}

	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}


	private char[] password;
	private String countryname;
	//private String[] hobbies;
    private String gender;
    private String doctorspeciality;
    
    public String getDoctorspeciality() {
		return doctorspeciality;
	}

	public void setDoctorspeciality(String doctorspeciality) {
		this.doctorspeciality = doctorspeciality;
	}


	//custom validator applied
    @Age(lower=30, upper=75)
    private Integer age;
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	private CommunicationDTO communicationDTO;
	public CommunicationDTO getCommunicationDTO() {
		return communicationDTO;
	}
	public void setCommunicationDTO(CommunicationDTO communicationDTO) {
		this.communicationDTO = communicationDTO;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}

}
