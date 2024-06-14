package com.rest.api.exceptions.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.api.exceptions.entity.UserDetails;

public interface UserRepository extends JpaRepository<UserDetails, String>{

}
