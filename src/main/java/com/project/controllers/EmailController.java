package com.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.api.EmailDTO;

@Controller
public class EmailController {

	@RequestMapping(value="/sendemail")
	public String sendEmail(/* @ModelAttribute("emailDTO") EmailDTO emailDTO ,*/ Model model) {
		model.addAttribute("emailDTO", new EmailDTO());
	//	model.addAttribute("username",username.toUpperCase());
		
		return "send-email-page";
	}
	


	@RequestMapping("/process-email")
	public String processEmail(@ModelAttribute("emailDTO") EmailDTO emailDTO ) {
		return "process-email-page";
	}


}
