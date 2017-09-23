package com.krupali.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		//Coach theCoach = context.getBean("thatSillyCoach",Coach.class);
		
		TennisCoach theCoach = context.getBean("tennisCoach",TennisCoach.class);
		//Coach myCoach = context.getBean("myPingPongCoach",Coach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		//System.out.println(myCoach.getDailyWorkout());
		
		System.out.println("Email: "+theCoach.getEmail());
		System.out.println("Team: "+theCoach.getTeam());
		
		//call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		//close the context
		context.close();
	}

}
