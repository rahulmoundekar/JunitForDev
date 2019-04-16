package com.junit.app.client;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.junit.app.test.OutputFileTest;

public class TestRunner {

	public static void main(String[] args) {

		Result result = JUnitCore.runClasses(OutputFileTest.class);
		for (Failure failure : result.getFailures()) {
			System.out.println("Result  : " + failure.toString());
		}

	}

}
