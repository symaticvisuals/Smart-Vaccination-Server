package com.project.api;

import org.springframework.stereotype.Component;

@Component
public class Doctor {
	private int id;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String aadhaar;
	private String location;
	private String email;
	private int availableSlots;
	private long phoneNumber;

	public Doctor() {
		super();
	}

	public Doctor(int i, String username, String password, String firstName, String lastName, String aadhaar,
			String location, String email, int availableSlots, long phoneNumber) {
		this.id = i;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.aadhaar = aadhaar;
		this.location = location;
		this.availableSlots = availableSlots;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getAvailableSlots() {
		return availableSlots;
	}

	public void setAvailableSlots(int availableSlots) {
		this.availableSlots = availableSlots;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", username=" + username + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", aadhaar=" + aadhaar + ", location=" + location + ", email=" + email
				+ ", availableSlots=" + availableSlots + ", phoneNumber=" + phoneNumber + "]";
	}
}
