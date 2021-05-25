package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// Load ( Creating a spring container)the spring  configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		//retrieve bean from Spring Container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		//call the methods
	System.out.println(theCoach.getDailyWorkout());
	System.out.println(theCoach.getDailyFortune());
		//close the context
		context.close();
	}

}
