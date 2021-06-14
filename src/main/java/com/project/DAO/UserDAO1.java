package com.project.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import com.project.api.User;

public class UserDAO1 {
	@Autowired
	JdbcTemplate jdbc ;

	@Bean
	public String addUser(User user) {
		// TODO Auto-generated method stub
		
		int records =jdbc.update("insert into tbl_user (firstName,lastName,age) values (?,?,?)",user.getFirstName(),user.getLastname(),user.getAge());
	if(records>0) {
		return "user added successfully";
	}else {
		return "error";
	}
	
	
	}

	
}
