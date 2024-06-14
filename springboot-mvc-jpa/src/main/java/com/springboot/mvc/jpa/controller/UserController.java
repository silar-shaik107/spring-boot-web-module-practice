package com.springboot.mvc.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.mvc.jpa.dto.UserRegisterDto;
import com.springboot.mvc.jpa.service.UserService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class UserController {
	
	@Autowired
	UserService userservice;
	
	//for loading HTML UI form
	//@GetMapping("register")
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	@ResponseBody
	public String sayHello() {
	    return "register";
	}

	
	//from Action End point for user registration
	//@PostMapping("user/register")
	@RequestMapping(value="/user/register", method=RequestMethod.POST)
	@ResponseBody
	public ModelAndView registerUser(HttpServletRequest request) {
		
		//Extracting data from HttpServletRequest to DTO
		
		UserRegisterDto userRegisterDto=new UserRegisterDto();
		
		userRegisterDto.setName(request.getParameter("name"));
		userRegisterDto.setEmailId(request.getParameter("email"));
		userRegisterDto.setContact(request.getParameter("contact"));
		userRegisterDto.setPassword(request.getParameter("pwd"));
		
		String result=userservice.userRegistration(userRegisterDto);
		
		ModelAndView modelandview=new ModelAndView();
		
		//setting result.jsp file name
		
		modelandview.setViewName("result");
		modelandview.addObject("message",result);
		
		return modelandview;
	}
}
