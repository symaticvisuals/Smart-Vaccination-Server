package com.project.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class DoctorInfoDTO {

	@NotBlank(message = "* Your Name can't be blank")
	@Size(min = 3, max = 15, message = "{doctor.size}")
	private String dfirstname ;
	private String dlastname;
    private String aadharcard;
    private String qualifications;
    private String locations;
    private String availableTimeSlots;
    
    
    
	public String getDfirstname() {
		return dfirstname;
	}





	public void setDfirstname(String dfirstname) {
		this.dfirstname = dfirstname;
	}





	public String getDlastname() {
		return dlastname;
	}





	public void setDlastname(String dlastname) {
		this.dlastname = dlastname;
	}





	public String getAadharcard() {
		return aadharcard;
	}





	public void setAadharcard(String aadharcard) {
		this.aadharcard = aadharcard;
	}





	public String getQualifications() {
		return qualifications;
	}





	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
	}





	public String getLocations() {
		return locations;
	}





	public void setLocations(String locations) {
		this.locations = locations;
	}





	public String getAvailableTimeSlots() {
		return availableTimeSlots;
	}





	public void setAvailableTimeSlots(String availableTimeSlots) {
		this.availableTimeSlots = availableTimeSlots;
	}

	
	
	@AssertTrue(message = "you have to agree to use our app")
	private boolean termAndCondition;

	public DoctorInfoDTO() {
		System.out.println("doctor info DTO contr called...");
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
