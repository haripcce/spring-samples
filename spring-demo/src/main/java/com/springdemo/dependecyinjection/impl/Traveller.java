package com.springdemo.dependecyinjection.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdemo.dependecyinjection.Car;
import com.springdemo.dependecyinjection.Journey;

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
