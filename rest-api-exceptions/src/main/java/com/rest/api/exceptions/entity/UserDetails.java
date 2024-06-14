package com.rest.api.exceptions.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class UserDetails {
	@Id
	private String emailId;
	private String name;
	private long mobileNumber;
	private String gender;
	private String city;

}
