package com.project.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {

	@NotBlank(message = "* Your Name can't be blank")
	@Size(min = 3, max = 15, message = "{username.size}")
	private String username = "user name here";

	@NotBlank(message = "* Crush Name can't be blank")
	@Size(min = 3, max = 15, message = "{crushname.size}")
	private String crushname = "crush name here";

	@AssertTrue(message = "you have to agree to use our app")
	private boolean termAndCondition;

	public UserInfoDTO() {
		System.out.println("user info DTO contr called...");
	}

	@Override
	public String toString() {
		return "UserInfoDTO [username=" + username + ", crushname=" + crushname + "]";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCrushname() {
		return crushname;
	}

	public void setCrushname(String crushname) {
		this.crushname = crushname;
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
