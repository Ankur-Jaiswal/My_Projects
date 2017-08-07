package com.artek.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.artek.model.User;
import com.artek.service.LoginService;


@Controller
public class LoginController {

	@Autowired
	public LoginService loginservice;
	
	@RequestMapping("/login")
	public String showLogin(Map<String,User> map)
	{
		System.out.println("Inside Login Controller");
		map.put("User",new User());
		return "login";
	}
	
	@RequestMapping(value="/savelogin", method=RequestMethod.POST)
	public String checkLogin(@ModelAttribute("User") User user)
	{
		System.out.println("Inside check controller");
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		loginservice.validateUser(user);
		
		return "login";
	}
}
