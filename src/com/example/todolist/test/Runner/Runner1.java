package com.example.todolist.test.Runner;

import com.example.todolist.test.test.FinalTest;
import com.example.todolist.test.testcase.addtodolist.TestSuiteAdd;
import com.example.todolist.test.testcase.edittodolist.TestSuiteEdit;
import com.example.todolist.test.testcase.login.TestSuiteLogin;

import junit.framework.TestSuite;

public class Runner1 extends CustomRunner{

	@Override
	public TestSuite getAllTests() {
		// TODO Auto-generated method stub
		TestSuite suite = new TestSuite();
		suite.addTest(TestSuiteLogin.getTestSuiteLogin());
		suite.addTest(TestSuiteAdd.getTestSuiteAdd());
		//suite.addTest(TestSuiteEdit.getTestSuiteEdit());
		suite.addTestSuite(FinalTest.class);
		if(isNeedRegenerate){
			regenerateTestCaseList(suite);
		}
		return suite;
		
				
	}

	
	
}
