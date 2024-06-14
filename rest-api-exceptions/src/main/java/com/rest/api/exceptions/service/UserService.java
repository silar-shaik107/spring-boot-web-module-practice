package com.rest.api.exceptions.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.api.exceptions.dto.UserRegister;
import com.rest.api.exceptions.entity.UserDetails;
import com.rest.api.exceptions.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	public String addUser( UserRegister request) {
		UserDetails details=new UserDetails();
		details.setEmailId(request.getEmailId());
		details.setName(request.getName());
		details.setGender(request.getGender());
		details.setMobileNumber(request.getMobileNumber());
		details.setCity(request.getCity());
		 userRepository.save(details);
		 return "User Registration Success";
	}

}
