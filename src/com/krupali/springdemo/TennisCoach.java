package com.krupali.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component
public class TennisCoach implements Coach {
//	@Autowired
//	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;
//	@Autowired
//	public  TennisCoach(FortuneService thefortuneService) {
//		fortuneService = thefortuneService;
//	}
	
	
	@Autowired
	public  TennisCoach(@Qualifier("fileFortuneService")FortuneService thefortuneService) {
		System.out.println("inside constructor using @autowired and @qualifier");
		fortuneService = thefortuneService;
	}
	public  TennisCoach() {
		System.out.println("inside default constructor");
	}
	
	
	//define my init method
	@PostConstruct
	public void myInitMethod()
	{
		System.out.println("Inside myInitMethod");
	}
	
	//define my destroy method
	@PreDestroy
	public void myDestroyMethod()
	{
		System.out.println("Inside myDestroyMethod");
	}
	

	//define setter method
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println("inside setFortuneService() method");
//		this.fortuneService = fortuneService;
//	}


//	@Autowired
//	public void methodInjectionDemo(FortuneService fortuneService) {
//		System.out.println("inside methodInjectionDemo() method");
//		this.fortuneService = fortuneService;
//	}

	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
