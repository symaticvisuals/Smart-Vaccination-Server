package com.project.DAO;

import com.project.api.UserInfoDTO;
import com.project.api.UserRegistrationDTO;

public interface UserDao {

	public int registerUser(UserRegistrationDTO user);

	//public int registerUser1(UserRegistrationDTO user);
}
