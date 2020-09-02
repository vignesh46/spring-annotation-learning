package com.srv.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//Example of setter injection
	@Autowired
	@Qualifier("randomFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach : Inside setFortuneService()");
		this.fortuneService = fortuneService;
	}
	
	//Can be injected even if the method name is not setter
	@Autowired
	@Qualifier("randomFortuneService")
	public void anyMethod(FortuneService fortuneService) {
		System.out.println("CricketCoach : Inside anyMethod()");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Jump!!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
