package com.springdemo.springaop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogJourney {
	@Before("execution (* com.springdemo.springaop.impl.Traveller.startJourney(..))")
	public void logBeforeJourneystarts() {
		System.out.println("journet going to start..");
	}

}
