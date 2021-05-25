package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopedemoApp {

	public static void main(String[] args) {
		//load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-ApplicationContext.xml");
		
		//retrive the bean from Spring Container
		CricketCoach theCoach = context.getBean("myCoach",CricketCoach.class);
		CricketCoach alphaCoach = context.getBean("myCoach",CricketCoach.class);
		//call methods
				
				theCoach.getDailyWorkout();
				theCoach.getDailyWorkout();
		boolean res = (theCoach == alphaCoach)?true:false;
		System.out.println("instances are same is "+res);
		System.out.println("memeory loactions are:\n"+theCoach.toString()+"\n"+alphaCoach.toString());

	}

}
