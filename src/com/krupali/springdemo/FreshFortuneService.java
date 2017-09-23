package com.krupali.springdemo;

public class FreshFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today you will get fresh fortune services!!";
	}

}
