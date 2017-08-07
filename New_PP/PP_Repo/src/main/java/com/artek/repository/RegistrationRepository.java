package com.artek.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.artek.model.User;

@Repository
public class RegistrationRepository {

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	public void signIn(User user)
	{
		System.out.println("Inside registration repository");
		 hibernateTemplate.save(user); 
	   /* for(User usr:register)
	    {
	    	System.out.println(usr.getEmail());
	    	System.out.println(usr.getFirstname());
	    	System.out.println(usr.getLastname());
	    }*/
		
		System.out.println("registration success");
	}
}
