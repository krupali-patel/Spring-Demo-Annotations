package com.krupali.springdemo;

public class WrestlingCoach implements Coach {

	
	private FortuneService fortuneService;
	
	
	public WrestlingCoach(FortuneService thefortuneService) {
fortuneService = thefortuneService;
	}
	@Override
	public String getDailyWorkout() {
	
		return "Wrestling : Practise daily!!!!";
	}
	@Override
	public String getDailyFortune() {
	
		return fortuneService.getFortune();
	}

}
