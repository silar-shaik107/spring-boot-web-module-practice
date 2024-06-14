package com.springboot.rest.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.api.Entity.UserData;
import com.springboot.rest.api.dto.MoreUsersInformation;
import com.springboot.rest.api.dto.UserRegisterDto;
import com.springboot.rest.api.dto.UserRegisterDtoV2;
import com.springboot.rest.api.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userservice;

	@PostMapping("/register")
	public ResponseEntity<String> registerUser(@RequestBody UserRegisterDto request) {
		System.out.println(request);

		if (request.getEmail() == null) {

			ResponseEntity<String> responseEntity = new ResponseEntity<>("Email Id Is Required",
					HttpStatus.BAD_REQUEST);

			return responseEntity;

		}

		String result = userservice.registerUser(request);

		if (result.equalsIgnoreCase(UserService.EMAIL_EXISTS)) {
			return new ResponseEntity<>(result, HttpStatus.OK);

		} else if (result.equalsIgnoreCase(UserService.USER_CREATED)) {
			return new ResponseEntity<>(result, HttpStatus.CREATED);

		}
		return new ResponseEntity<>("If Any Issue , Conatct info@gmail.com", HttpStatus.OK);

	}

	@GetMapping("/address")
	public String userRegisterWithAddress(@RequestBody UserRegisterDtoV2 request) {
		System.out.println(request);

		// service --> repository

		return "user succesfully registerd with address";
	}

	@GetMapping("/load")
	public UserRegisterDto loadAllUsers() {

		// service --> Repository

		return new UserRegisterDto();
	}

	// JSON array
	@PostMapping("/register/many")
	public String registerManyusers(@RequestBody List<UserRegisterDto> users) {
		users.forEach(System.out::println);

		// service-->> Repository
		String result = userservice.registerManyUsers(users);
		System.out.println(result);
		return "Users are Created successfully";
	}

	@PostMapping("/register/many/v2")
	public String registerManyUsers(@RequestBody MoreUsersInformation users) {

		users.getUsers().forEach(System.out::println);

		users.getAddress().forEach(System.out::println);

		return "Many users are created successfully";
	}

	@PostMapping("/v2/register")
	public String usersRegistredWithAddress(@RequestBody UserRegisterDtoV2 request) {
		System.out.println(request);

		return "Users created succsfully with addresss";
	}

	// path variables
	@GetMapping("/{emailId}")
	public UserData getUserInformation(@PathVariable("emailId") String email) {

		return userservice.getUserInformation(email);
	}

	@GetMapping("/{gender},{city}")
	public UserData getInfoByGenderAndCity(@PathVariable("gender") String gender, @PathVariable("city") String city) {

		return userservice.getUserByGenderAndCity(gender, city);
	}

	@GetMapping("/city")
	public List<UserData> getUserByCity(@RequestParam String city) {
		return userservice.getUserByCity(city);
	}

}
