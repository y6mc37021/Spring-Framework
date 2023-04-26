package com.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.demo.game.GameRunner;

@SpringBootApplication
public class SpringFrameworkDemoApplication {
	
	public static void main(String[] args) {
		//SpringApplication.run(SpringFrameworkDemoApplication.class, args);
		
		ConfigurableApplicationContext context = SpringApplication.run(SpringFrameworkDemoApplication.class, args);
		GameRunner gameRunner = context.getBean(GameRunner.class);
		gameRunner.run();
		
		
		
	}

}
