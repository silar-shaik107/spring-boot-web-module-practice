package com.springboot.mvc.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.springboot.mvc")
public class SpringbootMvcJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMvcJpaApplication.class, args);
	}

}
