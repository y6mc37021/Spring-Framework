package com.spring.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.demo.game.GameRunner;
import com.spring.demo.game.MarioGame;

@SpringBootApplication
public class SpringFrameworkDemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringFrameworkDemoApplication.class, args);
		
		MarioGame mario = new MarioGame();
		GameRunner runner = new GameRunner(mario);
		runner.run();
		
	}

}
