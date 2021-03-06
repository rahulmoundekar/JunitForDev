package com.junit.app.client;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.junit.app.test.JunitAnnotationsCode;

public class TestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(JunitAnnotationsCode.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("Result==" + result.wasSuccessful());
	}
}
