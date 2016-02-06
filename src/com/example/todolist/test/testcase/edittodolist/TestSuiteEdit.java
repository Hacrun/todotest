package com.example.todolist.test.testcase.edittodolist;

import junit.framework.TestSuite;

public class TestSuiteEdit {

	public static TestSuite getTestSuiteEdit(){
		TestSuite suite = new TestSuite();
		suite.addTestSuite(EditText_1.class);
		suite.addTestSuite(DeleteText.class);
		return suite;
	}
}
