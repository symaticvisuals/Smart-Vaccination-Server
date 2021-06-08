package com.project.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.project.api.UserRegistrationDTO;

@Component
public class EmailValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return UserRegistrationDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "communicationDTO.email", "email.empty");

		//whether the email is ending with ncuindia.edu
		String email = ((UserRegistrationDTO)target).getCommunicationDTO().getEmail(); 
		if(!email.endsWith("ncuindia.edu")) {
			errors.rejectValue("communicationDTO.email","email.invalidDomain");
		}
	}

}
