package com.springboot.rest.api.dto;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class UserRegisterDtoV2 {
	//JASON 3
	/*{
	    "firstName": "Mohammad Silar",
	    "lastName": "Shaik",
	    "gender": "Male",
	    "password": "Silar@123",
	    "dobYear": 2001,
	    "email": "silarshaik@gmail.com",
	    "mobile": 9866248875,
	    "address" : {
	                "city"    : "Guntur",
	                "state"   :  "Andhra Pradesh",
	                "country" :  "India",
	                "pincode" :   522019
	   }
	}*/
	
	private String firstName;
	private String lastName;
	private String gender;
	private String password;
	private int    dobYear;
	private String email;
	private long   mobile;
	@Autowired
	private AddressDetails addressdetails;

}
