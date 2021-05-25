package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		//getobject  
		ChessCoach theCoach =  context.getBean("myChessCoach",ChessCoach.class);
		
		//call methods
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		//System.out.println(theCoach.setFortuneService(null));
		
		//checking values 
		System.out.println("EMAIL ID: "+theCoach.getEmailAddress());
		
		System.out.println("Team is :"+theCoach.getTeam());
		//close context
		context.close();
	}

}
