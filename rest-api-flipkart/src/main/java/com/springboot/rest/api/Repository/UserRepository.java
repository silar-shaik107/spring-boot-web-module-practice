package com.springboot.rest.api.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.rest.api.Entity.UserData;
@Repository
public interface UserRepository extends JpaRepository<UserData,String> {   
	//custom query methods

	UserData findByGenderAndCity(String gender, String city);

	

	List<UserData> findByCity(String city);


}
