package com.krupali.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create a array of strings
	private String[] data = {"randomfortune1","randomfortune2","randomfortune3"};
	private Random myRandom = new Random();
	
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		return data[index];
	}

}
