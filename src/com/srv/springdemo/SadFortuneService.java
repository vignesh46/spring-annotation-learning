package com.srv.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Sad Fortune";
	}

}
