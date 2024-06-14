package com.springboot.rest.api.dto;

import lombok.Data;

@Data
public class UserRegisterDto {

	//JASON 2  object
	/*{
	    "firstName": "Mohammad Silar",
	    "lastName": "Shaik",
	    "gender": "Male",
	    "password": "Silar@123",
	    "city": "Guntur",
	    "dobYear": 2001,
	    "email": "silarshaik@gmail.com",
	    "mobile": 9866248875
	}*/
	
	private String firstName;
	private String lastName;
	private String gender;
	private String password;
	private String city;
	private int    dobYear;
	private String email;
	private long   mobile;
	
	
}
