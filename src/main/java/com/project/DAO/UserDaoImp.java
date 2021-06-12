package com.project.DAO;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.project.api.UserInfoDTO;
import com.project.api.UserRegistrationDTO;

@Repository
public class UserDaoImp implements UserDao{

	@Autowired
	JdbcTemplate jdbc ;
	
	
	
	@Override
	public int registerUser(UserRegistrationDTO user) {
		
		String sql="insert into tbl_user(user_name,user_email,user_password) values(?,?,?)";
		jdbc.update(sql,user.getUsername());
		return 0;
	}




}
