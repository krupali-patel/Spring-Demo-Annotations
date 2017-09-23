package com.krupali.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PracticeActivityConfigDemoApp {
	public static void main(String[] args) {
		
		//read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PracticeActivityConfig.class);
		
		//get the bean from spring container
		Coach theCoach = context.getBean("wrestlingCoach", WrestlingCoach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
				context.close();
	}
	
	

}
