package com.springboot.rest.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.springboot.rest.api.Entity.UserData;
import com.springboot.rest.api.Repository.UserRepository;
import com.springboot.rest.api.dto.AddressDetails;
import com.springboot.rest.api.dto.UserRegisterDto;
import com.springboot.rest.api.dto.UserRegisterDtoV2;

@Service
public class UserService {
	public static final String EMAIL_EXISTS = "Email is Already used,try with another Email";
	public static final String USER_CREATED = "User is Created Succesfully";
	@Autowired
	UserRepository repository;
	
	/*public UserData registerUser(UserRegisterDto request) {
		UserData userdata=mapDtoToUserData(request);
		
		return repository.save(userdata);
	}*/
	
	
	

	public String registerUser(UserRegisterDto request) {

		// Object Mapping :	// Bussiness Logic (BL)

		UserData userData = new UserData();
		userData.setEmail(request.getEmail());
		userData.setDobYear(request.getDobYear());
		userData.setCity(request.getCity());
		userData.setFirstName(request.getFirstName());
		userData.setGender(request.getGender());
		userData.setLastName(request.getLastName());
		userData.setMobile(request.getMobile());
		userData.setPassword(request.getPassword());

		repository.save(userData);

		return "User Registered SuccessFully.";
	}

	public String registerManyUsers(List<UserRegisterDto> request) {
		List<UserData> manyusers = new ArrayList<>();
		{
			for (UserRegisterDto request1 : request) {
				UserData userdata1 = new UserData();
				userdata1.setFirstName(request1.getFirstName());
				userdata1.setLastName(request1.getLastName());
				userdata1.setDobYear(request1.getDobYear());
				userdata1.setGender(request1.getGender());
				userdata1.setCity(request1.getCity());
				userdata1.setMobile(request1.getMobile());
				userdata1.setEmail(request1.getEmail());
				userdata1.setPassword(request1.getPassword());
              
				UserData userdata2 = new UserData();
				userdata2.setFirstName(request1.getFirstName());
				userdata2.setLastName(request1.getLastName());
				userdata2.setDobYear(request1.getDobYear());
				userdata2.setGender(request1.getGender());
				userdata2.setCity(request1.getCity());
				userdata2.setMobile(request1.getMobile());
				userdata2.setEmail(request1.getEmail());
				userdata2.setPassword(request1.getPassword());

				UserData userdata3 = new UserData();
				userdata3.setFirstName(request1.getFirstName());
				userdata3.setLastName(request1.getLastName());
				userdata3.setDobYear(request1.getDobYear());
				userdata3.setGender(request1.getGender());
				userdata3.setCity(request1.getCity());
				userdata3.setMobile(request1.getMobile());
				userdata3.setEmail(request1.getEmail());
				userdata3.setPassword(request1.getPassword());

				UserData userdata4 = new UserData();
				userdata4.setFirstName(request1.getFirstName());
				userdata4.setLastName(request1.getLastName());
				userdata4.setDobYear(request1.getDobYear());
				userdata4.setGender(request1.getGender());
				userdata4.setCity(request1.getCity());
				userdata4.setMobile(request1.getMobile());
				userdata4.setEmail(request1.getEmail());
				userdata4.setPassword(request1.getPassword());

				manyusers.add(userdata1);
				manyusers.add(userdata2);
				manyusers.add(userdata3);
				manyusers.add(userdata4);

			}
			repository.saveAll(manyusers);
			return "Many Users are added Succesfully";
		}
	}
    

	public UserData getUserInformation(String email) {
		
		return repository.findById(email).get();
	}

	public UserData getUserByGenderAndCity(String gender, String city) {

		return repository.findByGenderAndCity(gender, city);
	}
	

	

	public List<UserData> getUserByCity(String city) {
		return repository.findByCity(city);
	}
	

}
