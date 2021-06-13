package com.project.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {

	@NotBlank(message = "* Your Name can't be blank")
	@Size(min = 3, max = 15, message = "{username.size}")
	private String pfirstname;
	private String plastname;
	private String age;
	private int doseNumber;
	private String bookingTime;
	private boolean isVaccinated;
	private String vaccinationName;

	@Override
	public String toString() {
		return "UserInfoDTO [pfirstname=" + pfirstname + ", plastname=" + plastname + ", age=" + age + ", doseNumber="
				+ doseNumber + ", bookingTime=" + bookingTime + ", isVaccinated=" + isVaccinated + ", vaccinationName="
				+ vaccinationName + ", termAndCondition=" + termAndCondition + "]";
	}







	public String getPfirstname() {
		return pfirstname;
	}







	public void setPfirstname(String pfirstname) {
		this.pfirstname = pfirstname;
	}







	public String getPlastname() {
		return plastname;
	}







	public void setPlastname(String plastname) {
		this.plastname = plastname;
	}







	public String getAge() {
		return age;
	}







	public void setAge(String age) {
		this.age = age;
	}







	public int getDoseNumber() {
		return doseNumber;
	}







	public void setDoseNumber(int doseNumber) {
		this.doseNumber = doseNumber;
	}







	public String getBookingTime() {
		return bookingTime;
	}







	public void setBookingTime(String bookingTime) {
		this.bookingTime = bookingTime;
	}







	public boolean isVaccinated() {
		return isVaccinated;
	}







	public void setVaccinated(boolean isVaccinated) {
		this.isVaccinated = isVaccinated;
	}







	public String getVaccinationName() {
		return vaccinationName;
	}







	public void setVaccinationName(String vaccinationName) {
		this.vaccinationName = vaccinationName;
	}

	@AssertTrue(message = "you have to agree to use our app")
	private boolean termAndCondition;

	public UserInfoDTO() {
		System.out.println("user info DTO contr called...");
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
