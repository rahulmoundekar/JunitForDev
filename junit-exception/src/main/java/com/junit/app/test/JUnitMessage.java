package com.junit.app.test;

public class JUnitMessage {

	private String message;

	public JUnitMessage() {

	}

	public JUnitMessage(String message) {
		this.message = message;
	}

	public String printMessage() {
		int divide = 1 / 0;
		return message;
	}

	public String printHiMessage() {
		return "Hi!" + message;
	}

}
