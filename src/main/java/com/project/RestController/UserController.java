package com.project.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.DAO.UserDAO1;
import com.project.DAO.UserDao;
import com.project.api.User;
import com.project.service.UserService;

@RestController
public class UserController {

	
	
	@Autowired
	private UserDAO1 userDao; 
	
	@RequestMapping(path="/adduser",method = RequestMethod.POST)
	public String addUser(User user ) {
		return userDao.addUser(user);
		
	}
	
}
