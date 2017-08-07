package com.artek.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.artek.model.User;

@Component
public class RegistrationValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return User.class.isAssignableFrom(clazz);
		}

	public void validate(Object target, Errors error) {
		User user=(User)target;
		ValidationUtils.rejectIfEmpty(error, "email","plz enter email");
		ValidationUtils.rejectIfEmpty(error, "password","plz enter password");
		ValidationUtils.rejectIfEmpty(error, "firstname","plz enter First Name");
		ValidationUtils.rejectIfEmpty(error, "lastname","plz enter Last name");
		ValidationUtils.rejectIfEmpty(error, "mobno","plz enter mobile no");
	}

}
