package com.springboot.mvc.jpa.info;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="user_info")
public class UserInfo {
	@Id
	@Column
	private String emaild;
	@Column
	private String name;
	@Column
	private String contact;
	@Column
	private String password;
}
