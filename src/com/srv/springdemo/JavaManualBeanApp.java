package com.srv.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaManualBeanApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Coach swimCoach = context.getBean("swimCoach", Coach.class);
		
		System.out.println(swimCoach.getDailyWorkout());
		
		System.out.println(swimCoach.getDailyFortune());
		
		
		//Property Injection Example
		SwimCoach propertyInjection = context.getBean("swimCoach", SwimCoach.class);
		System.out.println(propertyInjection.getEmail());
		

	}

}
