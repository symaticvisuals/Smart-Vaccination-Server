package com.project.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.project.api.User;

public class UserDAO1 {
	@Autowired
	JdbcTemplate jdbc ;

	public String addUser(User user) {
		// TODO Auto-generated method stub
		
		int records =jdbc.update("insert into tbl_user (user_id,user_name,country,gender) values (?,?,?,?)",user.getUser_id(),user.getUser_name(),user.getCountry(),user.getGender() );
	if(records>0) {
		return "user added successfully";
	}else {
		return "error";
	}
	
	
	}

	
}
