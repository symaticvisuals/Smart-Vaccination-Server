package com.project.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class DoctorInfoDTO {

	@NotBlank(message = "* Your Name can't be blank")
	@Size(min = 3, max = 15, message = "{doctor.size}")
	private String doctorname = "doctor name here";
	
	public String getDoctorname() {
		return doctorname;
	}

	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}

	@AssertTrue(message = "you have to agree to use our app")
	private boolean termAndCondition;

	public DoctorInfoDTO() {
		System.out.println("doctor info DTO contr called...");
	}
	
	@Override
	public String toString() {
		return "DoctorInfoDTO [doctorname=" + doctorname + "]";
	}




	/**
	 * @return the termAndCondition
	 */
	public boolean isTermAndCondition() {
		return termAndCondition;
	}

	/**
	 * @param termAndCondition the termAndCondition to set
	 */
	public void setTermAndCondition(boolean termAndCondition) {
		this.termAndCondition = termAndCondition;
	}
}
