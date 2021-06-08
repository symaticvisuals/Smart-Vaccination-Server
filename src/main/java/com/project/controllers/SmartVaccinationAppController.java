package com.project.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.api.UserInfoDTO;

@Controller
public class SmartVaccinationAppController {

	@RequestMapping("/")
	public String showHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfo) {
		
		//read existingproperty by fetchingit from dto
		
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
