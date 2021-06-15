package com.project.api;

import org.springframework.stereotype.Component;

@Component
public class Patient {
	private int id;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String aadhaar;
	private String location;
	private String bookedDoctor;
	private String date;
	private long phoneNumber;

	public Patient(int i, String username, String password, String firstName, String lastName, String aadhaar,
			String location, String bookedDoctor, String date, long phoneNumber) {
		super();
		this.id = i;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.aadhaar = aadhaar;
		this.location = location;
		this.bookedDoctor = bookedDoctor;
		this.date = date;
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAadhaar() {
		return aadhaar;
	}

	public void setAadhaar(String aadhaar) {
		this.aadhaar = aadhaar;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBookedDoctor() {
		return bookedDoctor;
	}

	public void setBookedDoctor(String bookedDoctor) {
		this.bookedDoctor = bookedDoctor;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", username=" + username + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", aadhaar=" + aadhaar + ", location=" + location + ", bookedDoctor="
				+ bookedDoctor + ", date=" + date + ", phoneNumber=" + phoneNumber + "]";
	}

}
