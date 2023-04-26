package com.spring.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.demo.game.GameRunner;
import com.spring.demo.game.MarioGame;
import com.spring.demo.game.SuperContraGame;

@SpringBootApplication
public class SpringFrameworkDemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringFrameworkDemoApplication.class, args);
		
		MarioGame mario = new MarioGame();
		GameRunner marioGameRunner = new GameRunner(mario);
		marioGameRunner.run();
		
		SuperContraGame contra = new SuperContraGame();
		GameRunner contraGameRunner = new GameRunner(contra);
		contraGameRunner.run();
		
	}

}
