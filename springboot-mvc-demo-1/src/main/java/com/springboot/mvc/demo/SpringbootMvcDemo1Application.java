package com.springboot.mvc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.springboot.mvc")
public class SpringbootMvcDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMvcDemo1Application.class, args);
	}

}
