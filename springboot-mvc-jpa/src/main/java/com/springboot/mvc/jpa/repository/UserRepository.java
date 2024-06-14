package com.springboot.mvc.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.mvc.jpa.info.UserInfo;

@Repository
public interface UserRepository extends JpaRepository<UserInfo,String> {

}
