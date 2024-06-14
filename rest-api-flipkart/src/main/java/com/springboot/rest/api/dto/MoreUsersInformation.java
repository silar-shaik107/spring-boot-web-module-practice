package com.springboot.rest.api.dto;

import java.util.List;

import lombok.Data;

@Data
public class MoreUsersInformation {

	//JSON message
	List<UserRegisterDtoV2> users;
	List<AddressDetails> address;
	
	
}
