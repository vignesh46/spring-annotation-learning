package com.srv.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.srv.springdemo")
@PropertySource("classpath:sport.properties") //To do property Injection
public class JavaConfig {
	
	@Bean
	public FortuneService sadFortSev() {
		return new SadFortuneService();
	}
	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortSev());
	}

}
