package com.springboot.mvc.jpa.dto;

import lombok.Data;

@Data
public class UserRegisterDto {
  private String name;
  private String emailId;
  private String contact;
  private String password;
}
