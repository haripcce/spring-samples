package com.springdemo.springaop.impl;

import org.springframework.stereotype.Service;

import com.springdemo.springaop.Car;
@Service
public class Swift implements Car {

	public void move() {
		System.out.println("moving swift ..");

	}

}
