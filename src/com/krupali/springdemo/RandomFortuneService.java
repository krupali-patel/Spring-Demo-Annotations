package com.krupali.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create a array of strings
	private String[] data = {"randomfortune1","randomfortune2","randomfortune3"};
	private Random myRandom = new Random();
	
	 public RandomFortuneService() {
	System.out.println("I am inside RandomFortuneService constructor");	
	 }
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		return data[index];
	}

}
