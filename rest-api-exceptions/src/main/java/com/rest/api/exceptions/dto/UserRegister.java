package com.rest.api.exceptions.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserRegister {
	@jakarta.validation.constraints.NotNull(message = "Email Id should be Provided..")
	@NotBlank
	@Email(message = "Invalid Email Id Format,Please check Email value")
	private String emailId;

	@Size(min = 5, max = 20)
	private String name;
	private long mobileNumber;
	private String gender;
	private String city;

}
