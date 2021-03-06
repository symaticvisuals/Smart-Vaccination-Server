package com.project.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.api.UserInfoDTO;

@Controller
public class SmartVaccinationAppController {

	//@DeepanshuGoel
	// to do add name of home-page  
	@RequestMapping("/")
	public String showHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfo) {
		
		//read existing property by fetching it from dto
		
		return "home-page";
	}
	
	@RequestMapping("/process")
	public String showResultPage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO,BindingResult result) {
	
	System.out.println(	userInfoDTO.isTermAndCondition());
		if(result.hasErrors()) {
			
		List<ObjectError> allErrors = result.getAllErrors();	
		for(ObjectError temp : allErrors) {
			System.out.println(temp);
		}
			return "home-page";
		
		}
	
		
		return "result-page";
	}
}
