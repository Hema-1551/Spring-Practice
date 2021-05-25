package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	//define a private field for the depandancy
	private FortuneService fortuneService;
	
	
	//define a construcotr for depaendency injection
	public  BaseballCoach(FortuneService theFortuneService) {
		// TODO Auto-generated constructor stub
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
	return	fortuneService.getFortune();
		
	}

}
 