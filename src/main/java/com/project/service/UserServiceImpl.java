package com.project.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.project.DAO.UserDao;
import com.project.api.UserInfoDTO;
import com.project.api.UserRegistrationDTO;

@Service
public class UserServiceImpl implements UserService{

	
	@Autowired
	UserDao repo ;

	@Override
	public boolean registerUser(UserRegistrationDTO user) {
		return repo.registerUser(user) >0 ? true : false;
	}
	
	
	



	

	
}
