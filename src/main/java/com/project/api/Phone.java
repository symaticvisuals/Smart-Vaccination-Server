package com.project.api;

public class Phone {

	private String code;
	private String usernumber;
	@Override
	public String toString() {
		return "Phone [code=" + code + ", usernumber=" + usernumber + "]";
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getUsernumber() {
		return usernumber;
	}
	public void setUsernumber(String usernumber) {
		this.usernumber = usernumber;
	}
}
