package com.springboot.rest.api.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;
@Data
@Entity
@Table(name="flipkart_users",uniqueConstraints= {@UniqueConstraint(columnNames = { "email" })})
public class UserData {

	
	@Id
	
	@Column
	private String email;
	@Column
	private String lastName;
	@Column
	private String firstName;
	@Column
	private String gender;
	@Column
	private String password;
	@Column
	private String city;
	@Column
	private int    dobYear;
	@Column
	private long   mobile;
	
	
}
