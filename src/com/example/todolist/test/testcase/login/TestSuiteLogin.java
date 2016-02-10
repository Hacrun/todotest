package com.example.todolist.test.testcase.login;

import junit.framework.TestSuite;

public class TestSuiteLogin {

	public static TestSuite getTestSuiteLogin(){
		TestSuite suite = new TestSuite();
		suite.addTestSuite(LoginTestCase_1.class);
		suite.addTestSuite(LoginTestCase2.class);
		suite.addTestSuite(LoginTestCase_crash_3.class);
		return suite;
	}
}
