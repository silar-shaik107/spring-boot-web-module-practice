package com.springboot.mvc.register;

import lombok.Data;

@Data
public class UserRegisterRequest {
	
	//JASON data
	/*{
		  "firstName" : "Mohammad Silar",
		  "lastName"  : "Shaik",
		  "gender"    : "male",
		  "age"       :  23,
		  "contact"   :  9866248875,
		  "emailId"   : "silar@gmail.com",
		  "address"   : "Ganikapudi"
		}*/
       private String firstName;
       private String lastName;
       private String gender;
       private int age;
       private long contact;
       private String emailId;
       private String address;
       
}
