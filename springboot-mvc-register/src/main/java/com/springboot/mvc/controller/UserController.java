package com.springboot.mvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mvc.register.UserRegisterRequest;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@PostMapping("/register")
	
	public String getUserdetails(@RequestBody UserRegisterRequest request) {
		System.out.println(request.getFirstName());
		System.out.println(request.getLastName());
		System.out.println(request.getAge());
		System.out.println(request.getContact());
		System.out.println(request.getGender());
		System.out.println(request.getEmailId());
		System.out.println(request.getAddress());
		
		return "User Created Successfully";
	} 
	@GetMapping("/login")
	
	public String userLoggin() {
		return "User Logged Succesfully";
	}

}
