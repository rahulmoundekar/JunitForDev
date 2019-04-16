package com.junit.app.test;

import static org.junit.Assert.*;
import org.junit.Test;

public class JunitAssertionCode {

	@Test
	public void testAssert() {

		// Variable declaration
		String string1 = "Junit";
		String string2 = "Junit";

		String string3 = "test";
		String string4 = "test";
		// String string4 = new String("test");
		String string5 = null;

		int variable1 = 1;
		int variable2 = 2;

		int[] airethematicArrary1 = { 1, 2, 3 };
		int[] airethematicArrary2 = { 1, 2, 3 };

		// Assert statements
		assertEquals(string1, string2);
		assertSame(string3, string4);
		assertNotSame(string1, string3);
		assertNotNull(string1);
		assertNull(string5);

		assertTrue(variable1 < variable2);
		assertArrayEquals(airethematicArrary1, airethematicArrary2);
	}

}

/*
 * Lets analyse expected output step by step:
 * 
 * Consider all assert statements one by one:
 * 
 * assertEquals(string1,string2); Now compare string1=" Junit" with
 * string2=" Junit" with equals method of object class. Replacing assertEquals
 * method from java.lang.Object.equals() method :
 * 
 * string1.equals(string2)=> returns true
 * 
 * So assertEquals(string1,string2) will return true.
 * 
 * assertSame(string3, string4); "assertSame()" functionality is to check that
 * the two objects refer to the same object.
 * 
 * Since string3="test" and string4="test" means both string3 and string4 are of
 * the same type so assertSame(string3, string4) will return true.
 * 
 * assertNotSame(string1, string3); "assertNotSame()" functionality is to check
 * that the two objects do not refer to the same object.
 * 
 * Since string1="Junit" and string3="test" means both string1 and string3 are
 * of different types, so assertNotSame(string1, string3) will return true.
 * 
 * assertNotNull(string1); "assertNotNull()" functionality is to check that an
 * object is not null.
 * 
 * Since string1= "Junit" which is a non-null value so assertNotNull(string1)
 * will return true.
 * 
 * assertNull(string5); "assertNull()" functionality is to check that an object
 * is null.
 * 
 * Since string5= null which is a null value so assertNull(string5) will return
 * true.
 * 
 * assertTrue(variable1<variable2); "assertTrue()" functionality is to check
 * that a condition is true.
 * 
 * Since variable1=1 and variable2=2, which shows that variable1<variable2
 * condition is true so assertTrue(variable1<variable2) will return true.
 * 
 * assertArrayEquals(airethematicArrary1, airethematicArrary2);
 * "assertArrayEquals()" functionality is to check that the expected array and
 * the resulted array are equal. The type of Array might be int, long, short,
 * char, byte or java.lang.Object.
 * 
 * Since airethematicArrary1 = { 1, 2, 3 } and airethematicArrary2 = { 1, 2, 3 }
 * which shows both the arrays are equal so
 * assertArrayEquals(airethematicArrary1, airethematicArrary2) will return true
 * 
 * Since all seven assert statements of Junit4AssertionTest.java class returns
 * true, therefore when you execute the test assert class, it will return a
 * successful test. (see the output below)
 */
