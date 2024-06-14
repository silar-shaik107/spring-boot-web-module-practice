package com.springboot.mvc.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.mvc.jpa.dto.UserRegisterDto;
import com.springboot.mvc.jpa.info.UserInfo;
import com.springboot.mvc.jpa.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository repository;
	
	public String userRegistration(UserRegisterDto userregistrationdto) {
		
		//convert dto(Data Transfer Object ) instance to entity object
		UserInfo user=new UserInfo();
		user.setContact(userregistrationdto.getContact());
		user.setEmaild(userregistrationdto.getEmailId());
		user.setName(userregistrationdto.getName());
		user.setPassword(userregistrationdto.getPassword());
		repository.save(user);
		
		return "User Registration Succesfull.";
	}

}
