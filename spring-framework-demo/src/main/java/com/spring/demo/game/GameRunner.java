package com.spring.demo.game;

public class GameRunner {
	private MarioGame mario;

	public GameRunner(MarioGame mario) {
		this.mario=mario;
	}

	public void run() {
		mario.down();
		mario.up();
	}

}
