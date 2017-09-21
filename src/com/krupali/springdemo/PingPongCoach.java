package com.krupali.springdemo;

import org.springframework.stereotype.Component;

@Component("myPingPongCoach")
public class PingPongCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "PingPong daily workout rule : practice 30 minutes daily";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
