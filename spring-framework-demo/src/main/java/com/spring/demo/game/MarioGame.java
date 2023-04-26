package com.spring.demo.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole{
	
	public void up() {
		System.out.println("MarioGame Up");
	}
	
	public void down() {
		System.out.println("MarioGame down");
	}
}
