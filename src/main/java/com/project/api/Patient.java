package com.project.api;

import org.springframework.stereotype.Component;

@Component
public class Patient {
	private String firstName;
	private String lastname;
	private String age;
	private String doseNumber;
	private String bookingTime;
	private String vaccineStatus;
	private String vaccineName;

	public String getFirstName() {
		return firstName;
	}

	@Override
	public String toString() {
		return "Patient [firstName=" + firstName + ", lastname=" + lastname + ", age=" + age + ", doseNumber="
				+ doseNumber + ", bookingTime=" + bookingTime + ", vaccineStatus=" + vaccineStatus + ", vaccineName="
				+ vaccineName + "]";
	}

	public Patient(String firstName, String lastname, String age, String doseNumber, String bookingTime,
			String vaccineStatus, String vaccineName) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
		this.age = age;
		this.doseNumber = doseNumber;
		this.bookingTime = bookingTime;
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

	public String getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(String bookingTime) {
		this.bookingTime = bookingTime;
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
