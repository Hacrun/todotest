package com.example.todolist.test.testcase.login;

import junit.framework.TestSuite;

public class TestSuiteLogin {

	public static TestSuite getTestSuiteLogin(){
		TestSuite suite = new TestSuite();
		suite.addTestSuite(LoginTestCase_1.class);
		suite.addTestSuite(LoginTestCase2.class);
		return suite;
	}
}
