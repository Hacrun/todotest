package com.example.todolist.test.Runner;

import com.example.todolist.test.test.FinalTest;
import com.example.todolist.test.testcase.addtodolist.TestSuiteAdd;
import com.example.todolist.test.testcase.edittodolist.TestSuiteEdit;
import com.example.todolist.test.testcase.login.TestSuiteLogin;

import junit.framework.TestSuite;

public class Runner1 extends CustomRunner {

	@Override
	public TestSuite getAllTests() {
		TestSuite suite = new TestSuite();
		suite.addTest(TestSuiteLogin.getTestSuiteLogin());
		suite.addTest(TestSuiteAdd.getTestSuiteAdd());
		suite.addTestSuite(FinalTest.class);
		if (isNeedRegenerate) {
			suite = regenerateTestCaseList(suite);
		}
		return suite;
	}

	
}
