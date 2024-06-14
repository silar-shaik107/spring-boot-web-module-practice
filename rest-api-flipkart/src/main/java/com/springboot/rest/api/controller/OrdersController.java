package com.springboot.rest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.api.service.OrdersService;

@RestController
public class OrdersController {
 
	@Autowired
	OrdersService ordersService;
	
	
	@GetMapping("/order/payment/{amount}")
	public String makePaymentOrder(@PathVariable String amount) {
		return ordersService.makePaymentForOrder(amount);
	}
	
}
