package com.project.api;

import org.springframework.stereotype.Component;

@Component
public class User {
	
	private int user_id;
	private String user_name;
	private String country;
	private String gender;
	 public User(){
		
	}
	public User(int user_id, String user_name, String country, String gender) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.country = country;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "user [user_id=" + user_id + ", user_name=" + user_name + ", country=" + country + ", gender=" + gender
				+ "]";
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	} 

}
