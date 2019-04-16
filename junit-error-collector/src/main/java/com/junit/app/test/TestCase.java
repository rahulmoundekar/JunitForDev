package com.junit.app.test;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class TestCase {

	@Rule
	public ErrorCollector collector = new ErrorCollector();

	@Test
	public void example() {
		collector.addError(new Throwable("There is an error in first line"));
		collector.addError(new Throwable("There is an error in second line"));

		System.out.println("Hello");
		try {
			Assert.assertTrue("A" == "B");
		} catch (Throwable t) {
			collector.addError(t);
		}
		System.out.println("World!!!!");
	}

}
