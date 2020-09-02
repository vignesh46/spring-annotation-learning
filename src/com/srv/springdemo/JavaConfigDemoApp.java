package com.srv.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		//Constructor Injection
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println(tennisCoach.getDailyWorkout());
		
		System.out.println(tennisCoach.getDailyFortune());
		
		
		//Setter Injection
		Coach cricketCoach = context.getBean("cricketCoach", Coach.class);
		
		System.out.println(cricketCoach.getDailyWorkout());
		
		System.out.println(cricketCoach.getDailyFortune());
		
		
		//Field Injection
		Coach baseballCoach = context.getBean("baseballCoach", Coach.class);
		
		System.out.println(baseballCoach.getDailyWorkout());
		
		System.out.println(baseballCoach.getDailyFortune());
		
		
		TennisCoach propertyExample = context.getBean("tennisCoach", TennisCoach.class);
		System.out.println(propertyExample.getEmail());
		

		context.close();
		
	}

}
