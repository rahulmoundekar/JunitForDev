package com.junit.app.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitAnnotationsCode {

	private ArrayList<String> list;

	@BeforeClass
	public static void m1() {
		System.out.println("Using @BeforeClass , executed before all test cases ");
	}

	@Before
	public void m2() {
		list = new ArrayList<String>();
		System.out.println("Using @Before annotations ,executed before each test cases ");
	}

	@AfterClass
	public static void m3() {
		System.out.println("Using @AfterClass ,executed after all test cases");
	}

	@After
	public void m4() {
		list.clear();
		System.out.println("Using @After ,executed after each test cases");
	}

	@Test
	public void m5() {
		list.add("test");
		assertFalse(list.isEmpty());
		assertEquals(1, list.size());
	}

	@Ignore
	public void m6() {
		System.out.println("Using @Ignore , this execution is ignored");
	}

	@Test(timeout = 10)
	public void m7() {
		System.out.println("Using @Test(timeout),it can be used to enforce timeout in JUnit4 test case");
	}

	@Test(expected = NoSuchMethodException.class)
	public void m8() {
		System.out.println("Using @Test(expected) ,it will check for specified exception during its execution");

	}

}

/*
 * 
 * Expected Result
 * 
 * All the test cases will be executed one by one, and all print statement can
 * be seen on a console. As discussed in above table @Before, @BeforeClass [
 * method m1() and m2() ] will be executed before each and before all test cases
 * respectively. In the same way @after,@afterClass (method m3() and m4()) will
 * be executed after each and after all test cases respectively. @ignore (method
 * m6())will be treated as ignoring the test.
 */

/* output : 
 * 
 *
 * See below print statements which can be seen on console:
 * 
 * Using @BeforeClass , executed before all test cases
 * 
 * Using @Before annotations, executed before each test cases
 * 
 * Using @After, executed after each test cases
 * 
 * Using @Before annotations, executed before each test cases
 * 
 * Using @Test(timeout),it can be used to enforce timeout in JUnit4 test case
 * 
 * Using @After, executed after each test cases
 * 
 * Using @Before annotations, executed before each test cases
 * 
 * Using @Test(expected) ,it will check for specified exception during its
 * execution
 * 
 * Using @After, executed after each test cases
 * 
 * Using @AfterClass, executed after all test cases
 */