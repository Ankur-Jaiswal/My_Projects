package com.artek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artek.model.User;
import com.artek.repository.RegistrationRepository;

@Service
public class RegisterService {

	@Autowired
	private RegistrationRepository registrationRepository;
	
	
	public void validateUser(User user)
	{
		System.out.println("Inside registration service");
		System.out.println(user.getEmail());
		registrationRepository.signIn(user);
	}
}
