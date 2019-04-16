package com.junit.app.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OutputFileTest {

	@Before
	public void createOutputFile() {
		System.out.println("@Before");
	}

	@After
	public void deleteOutputFile() {
		System.out.println("@After");
	}

	@Test
	public void testFile1() {
		String str = "I am done with Junit Setup";
		assertEquals("I am done with Junit Setup", str);
	}

	@Test
	public void testFile2() {
		String str = "I am done with TextFixture Setup";
		assertEquals("I am done with TextFixture Setup", str);
	}

}

/* 
 output
  	@Before
	@After
	@Before
	@After
 
 */
