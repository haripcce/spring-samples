package com.springdemo.dependecyinjection.impl;

import org.springframework.stereotype.Service;

import com.springdemo.dependecyinjection.Car;
@Service
public class Swift implements Car {

	public void move() {
		System.out.println("moving swift ..");

	}

}
