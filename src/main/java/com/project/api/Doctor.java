package com.project.api;

import org.springframework.stereotype.Component;

@Component
public class Doctor {
	public Doctor(String firstName, String lastname, String location, String aadharCard, String qualification,
			String availableSlot) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
		this.location = location;
		this.aadharCard = aadharCard;
		this.qualification = qualification;
		this.availableSlot = availableSlot;
	}

	private String firstName;

	@Override
	public String toString() {
		return "Doctor [firstName=" + firstName + ", lastname=" + lastname + ", location=" + location + ", aadharCard="
				+ aadharCard + ", qualification=" + qualification + ", availableSlot=" + availableSlot + "]";
	}

	public String getFirstName() {
		return firstName;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getAvailableSlot() {
		return availableSlot;
	}

	public void setAvailableTime(String availableTime) {
		this.availableSlot = availableSlot;
	}

	private String lastname;
	private String location;
	private String aadharCard;
	private String qualification;
	private String availableSlot;

}
