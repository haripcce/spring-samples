package com.springdemo.pojo.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
public class Car {

	public void move() {
		System.out.println("moving...");
	}

	@Bean
	@Scope(value = "prototype")
	public Employee createEmployee() {
		return new Employee();
	}

}
