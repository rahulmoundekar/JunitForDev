package com.junit.app.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test1 {

	public String message = "Rahul";

	JUnitMessage junitMessage = new JUnitMessage(message);

	@Test
	public void testJUnitMessage() {
		System.out.println("Junit Message is printing ");
		junitMessage.printMessage();

	}

	@Test
	public void testJUnitHiMessage() {
		message = "Hi!" + message;
		System.out.println("Junit Hi Message is printing ");
		assertEquals(message, junitMessage.printHiMessage());
		System.out.println("Suite Test 2 is successful " + message);
	}

}
