package com.krupali.springdemo;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	public DatabaseFortuneService() {
		System.out.println("inside DatabaseFortuneService constructor");
	}
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
