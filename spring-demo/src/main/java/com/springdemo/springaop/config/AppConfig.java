package com.springdemo.springaop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.springdemo.springaop.LogJourney;

@Configuration
@ComponentScan(basePackages = "com.springdemo.springaop")
@EnableAspectJAutoProxy
public class AppConfig {
	@Bean // the Aspect itself must also be a Bean
	public LogJourney myAspect() {
		return new LogJourney();
	}
}
