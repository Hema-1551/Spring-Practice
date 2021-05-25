package com.luv2code.springdemo;

public class ArrayOfFortunes implements FortuneService {

	String fortunesArray[] = { "Have a great day !",
									"Remid the goal !",
									"My father is my inspiration !"};
	int min=0, max=2, range= max-min+1;
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int ran = (int)(Math.random()*range); 
		return fortunesArray[ran];
	}

}
