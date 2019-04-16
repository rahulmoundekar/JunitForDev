package com.junit.app.client;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.junit.app.test.Test1;
import com.junit.app.test.Test2;

@RunWith(Suite.class)
@Suite.SuiteClasses({ Test1.class, Test2.class, })
public class TestRunner {

}



/*
output:

Junit Message is printing 
Junit Hi Message is printing 
Suite Test 2 is successful Hi!Rahul
Suite Test 1 is successful Y

*/