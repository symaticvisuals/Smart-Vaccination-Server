package com.project.api;

import org.springframework.stereotype.Component;

@Component
public class User {
	private String firstName;
	private String lastname;
	private String age;
	private String doseNumber;
	private String startTime;
	private String endTime;
	private String vaccineStatus;
	private String vaccineName;
	private String aadharCard;
	private String doctorName;

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastname=" + lastname + ", age=" + age + ", doseNumber=" + doseNumber
				+ ", startTime=" + startTime + ", endTime=" + endTime + ", vaccineStatus=" + vaccineStatus
				+ ", vaccineName=" + vaccineName + ", aadharCard=" + aadharCard + ", doctorName=" + doctorName + "]";
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getFirstName() {
		return firstName;
	}

	public User(String firstName, String lastname, String age, String doseNumber, String bookingTime,
			String vaccineStatus, String vaccineName) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
		this.age = age;
		this.doseNumber = doseNumber;
		this.vaccineStatus = vaccineStatus;
		this.vaccineName = vaccineName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getDoseNumber() {
		return doseNumber;
	}

	public void setDoseNumber(String doseNumber) {
		this.doseNumber = doseNumber;
	}

	public String getVaccineStatus() {
		return vaccineStatus;
	}

	public void setVaccineStatus(String vaccineStatus) {
		this.vaccineStatus = vaccineStatus;
	}

	public String getVaccineName() {
		return vaccineName;
	}

	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}
}
