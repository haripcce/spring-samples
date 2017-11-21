package com.springdemo.springaop.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdemo.springaop.Car;
import com.springdemo.springaop.Journey;

@Service
public class Traveller implements Journey {
	@Autowired
	private Car car;

	/*
	 * @Autowired public Traveller(Car car) { this.car = car; }
	 */

	public void startJourney() {
		System.out.println("journey started..");
		car.move();

	}

}
