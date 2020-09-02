package com.srv.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("tennisCoach")
@Component //tennisCoach will be the default bean Id - first letter will be small
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${email}")
	private String coachEmail;
	
	//Example of constructor injection
	@Autowired
	public TennisCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run!";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public String getEmail() {
		return coachEmail;
	}
	
	//Example of init method
	@PostConstruct
	public void doMyStartUpStuff() {
		
		System.out.println("doMyStartUpStuff Method");
		
	}
	
	//Example of destroy method
	@PreDestroy
	public void doMyCleanUpStuff() {
		
		System.out.println("doMyCleanUpStuff Method");
		
	}

}
