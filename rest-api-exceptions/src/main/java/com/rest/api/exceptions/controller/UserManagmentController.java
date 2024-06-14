package com.rest.api.exceptions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rest.api.exceptions.dto.UserRegister;
import com.rest.api.exceptions.service.UserService;
import jakarta.validation.Valid;



@RestController
@RequestMapping("/user")
public class UserManagmentController {
	
	@Autowired
	UserService userService;
	
	
	//Is this invalid Request
	@PostMapping("/register")
	public String addUser( @Valid @RequestBody UserRegister request) {
		return this.userService.addUser(request);
		
	}
	
}
