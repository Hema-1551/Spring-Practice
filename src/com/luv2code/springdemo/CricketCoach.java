package com.luv2code.springdemo;

public class CricketCoach implements Coach {
private FortuneService fortuneService;

public CricketCoach() {
	// TODO Auto-generated constructor stub
}
public  CricketCoach(FortuneService theFortuneService) {
	fortuneService = theFortuneService;
}
	
	
	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It! "+fortuneService.getFortune();
		
	}

}
