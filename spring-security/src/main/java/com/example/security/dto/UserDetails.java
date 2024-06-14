package com.example.security.dto;

import lombok.Data;

@Data
public class UserDetails {
	
	private int id;
	private String name;
	private String email;
	private String password;
	private String roles;

}
