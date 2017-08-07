package com.artek.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.artek.model.User;
import com.artek.service.LoginService;
import com.artek.service.RegisterService;
import com.artek.validator.RegistrationValidator;

@Controller
public class RegistrationController {

	@Autowired RegisterService registerService;
	@Autowired RegistrationValidator registervalidator;
   
	
	@RequestMapping("/registration")// To show form
	public String register(Map<String,User> map)
	{
		System.out.println("Inside Registration Controller");
		map.put("User",new User());
		return "registration";
	}
	
	@RequestMapping(value="/registration_submit",method=RequestMethod.POST)//form action will be perform here (registration_submit)
	public String checkRegister(@ModelAttribute("User")User user,BindingResult bindingResult)
	{
		System.out.println("Inside check controller");
		System.out.println(user.getEmail());
		registervalidator.validate(user, bindingResult);
		if(bindingResult.hasErrors())
		{
			return "registration";
		}
		System.out.println("Spring validation performed");
		registerService.validateUser(user);
		return "registration";
	}

}
