package com.project.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.project.api.UserRegistrationDTO;

public class UserNameValidator implements Validator {

	//check if the UserNameValidator supports a given object
	@Override
	public boolean supports(Class<?> clazz) {
		
		return UserRegistrationDTO.class.equals(clazz);
	}

	//custom validator logic
	@Override
	public void validate(Object object, Errors errors) {
		// TO check if the field is null
		ValidationUtils.rejectIfEmpty(errors, "username", "username.empty", "username cannot be empty");

	//string should contain a _
	String username=((UserRegistrationDTO)object).getUsername();
	if(!username.contains("_")) {
		errors.rejectValue("username","username.invalidString","String should contain a _");
	}
	
	}

}
