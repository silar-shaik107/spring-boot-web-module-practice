package com.springboot.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("/ipad")
public class IphoneController {
	
	//@GetMapping("/message")
	@RequestMapping(path="/ipad/message",method=RequestMethod.GET)
	@ResponseBody
	public String printPhoneMessage() {
		
		//Logic of method
		return "Welcome To Iphone Message";
	}
	//@GetMapping("/cost")
	@RequestMapping(path="/ipad/cost",method=RequestMethod.GET)
	@ResponseBody
	public String printIphone14Cost() {
		return "Price is INR:1500000";
	}
	
	@RequestMapping(path="/ipad/model" ,method=RequestMethod.GET)
	@ResponseBody
    public String printModel() {
    	return "Iphone Model is 2024 Model";
    }
	
	@DeleteMapping("/ipad/delete")
	@ResponseBody
	public String deleteProduct() {
		return "Product is Deleted";
	}
}
