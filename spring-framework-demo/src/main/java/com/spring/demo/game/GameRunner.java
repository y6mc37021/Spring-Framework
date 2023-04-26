package com.spring.demo.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	@Autowired
	private GamingConsole console;

	public GameRunner(GamingConsole console) {
		this.console=console;
	}
	

	public void run() {
		console.down();
		console.up();
	}

}
