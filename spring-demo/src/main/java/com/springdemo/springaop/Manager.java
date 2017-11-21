package com.springdemo.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springdemo.springaop.config.*;

public class Manager {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		Journey journey = ctx.getBean(Journey.class);
		journey.startJourney();
	}
}
