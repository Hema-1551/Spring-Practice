package com.luv2code.springdemo;

public class ChessCoach implements Coach {
	private FortuneService fortuneService;
	private String emailAddress, team;
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		System.out.println("EMAIL ID: "+this.emailAddress);
	}
	public void setTeam(String team) {
		this.team = team;
		System.out.println("BELONG TO TEAM "+this.team);
	}
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getTeam() {
		return team;
	}
	//create no-arg constructor
	 public ChessCoach()  {
		System.out.println("ChessCoach : inside no-arg consstrucotr");
	}
	@Override
	public String getDailyWorkout() {
		
		return "Play with your supirior and learn from mistakes";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
	//our setter method
	public void setFortuneService( FortuneService fortuneService)
	{
		this.fortuneService = fortuneService;
		System.out.println("ChessCoach : inside Setter method -setFortuneService");	
	}
}
