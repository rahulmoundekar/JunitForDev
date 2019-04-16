package com.junit.app.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit {

	@Test
	public void testUnitSetup() {
		String str = "I am done with Junit Setup";
		assertEquals("I am done with Junit Setup", str);
	}

}
