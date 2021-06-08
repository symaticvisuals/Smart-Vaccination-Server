package com.project.controllers;

import java.nio.charset.IllegalCharsetNameException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.api.CommunicationDTO;
import com.project.api.Phone;
import com.project.api.UserRegistrationDTO;
import com.project.propertyeditor.NamePropertyEditor;
import com.project.validator.EmailValidator;
import com.project.validator.UserNameValidator;

@Controller
public class RegistrationController {
	
	@Autowired
	private EmailValidator emailvalidator;

	@RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("userRegister") UserRegistrationDTO userRegistrationDTO) {
		userRegistrationDTO.setName("abhi");
		userRegistrationDTO.setName("abhi123@");
		System.out.println("inside showRegistrationMethod");

		// load the saved user data from db
		Phone phone = new Phone();
		phone.setCode("91");
		phone.setUsernumber("2233445566");

		CommunicationDTO communicationDTO = new CommunicationDTO();
		communicationDTO.setPhone(phone);
		userRegistrationDTO.setCommunicationDTO(communicationDTO);
		

		return "user-registration-page";
	}

	@RequestMapping("/registration-sucess")
	public String processUserRegistration(@Valid @ModelAttribute("userRegister") UserRegistrationDTO userRegistrationDTO,BindingResult result) {
	
		System.out.println("inside processUserReg method");
		System.out.println("Name value entered by user : " + userRegistrationDTO.getName()+ "|" );
		
		//validator manually
//		EmailValidator validator = new EmailValidator();
emailvalidator.validate(userRegistrationDTO, result);
 		
		if(result.hasErrors()) {
		System.out.println("my page has errors");
		List<ObjectError> allErrors = result.getAllErrors();
		for(ObjectError error : allErrors) {
			System.out.println(error);
		}
		return "user-registration-page";
	}
		System.out.println("inside processRegistrationMethod");

		// save the dto object in to our db

		return "registration-sucess";
	}

@InitBinder
public void initBinder(WebDataBinder binder) {
	System.out.println("Inside initBinder method...");
	
//	binder.setDisallowedFields("name");
//	binder.setDisallowedFields("password"); 

	StringTrimmerEditor editor =  new StringTrimmerEditor(true);
	binder.registerCustomEditor(String.class, "name", editor);
	
	NamePropertyEditor  nameEditor = new NamePropertyEditor();
	binder.registerCustomEditor(String.class, "name",nameEditor);
	//binder.registerCustomEditor(String.class, nameEditor);
	
	
	
	UserNameValidator validator = new UserNameValidator();
	binder.addValidators(validator);
	
	//binder.addValidators(new EmailValidator());
	
	
	
	
	
}	
}