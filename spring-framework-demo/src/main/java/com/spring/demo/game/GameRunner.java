package com.spring.demo.game;

public class GameRunner {
	private GamingConsole console;

	public GameRunner(GamingConsole console) {
		this.console=console;
	}
	

	public void run() {
		console.down();
		console.up();
	}

}
