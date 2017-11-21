package com.springdemo.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemo.pojo.config.AppConfig;
import com.springdemo.pojo.model.Car;
import com.springdemo.pojo.model.Employee;

public class Manager {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		/*Car car = (Car) ctx.getBean("car");
		System.out.println(car);
		car.move();*/
		Employee emp = (Employee) ctx.getBean("createEmployee");
		System.out.println(emp);
		Employee emp1 = (Employee) ctx.getBean("createEmployee");
		System.out.println(emp1);
		/*ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springdemo/pojo/beans.xml");
		Employee emp = (Employee) ctx.getBean("adib");
		emp.sayHello();*/
		
	}
}
