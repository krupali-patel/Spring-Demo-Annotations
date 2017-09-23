package com.krupali.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.krupali.springdemo")
public class PracticeActivityConfig {
	
	@Bean
	public FortuneService freshFortuneService()
	{
		return new FreshFortuneService();
	}
	
	@Bean
	public Coach wrestlingCoach()
	{
		return new WrestlingCoach(freshFortuneService());
	}

}
