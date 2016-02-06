package com.example.todolist.test.testcase.addtodolist;

import junit.framework.TestSuite;

public class TestSuiteAdd {

	public static TestSuite getTestSuiteAdd(){
		TestSuite suite = new TestSuite();
		suite.addTestSuite(AddTestCase.class);
		return suite;
	}
}
