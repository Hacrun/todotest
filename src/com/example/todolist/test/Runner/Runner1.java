package com.example.todolist.test.Runner;

import com.example.todolist.test.testcase.addtodolist.TestSuiteAdd;
import com.example.todolist.test.testcase.edittodolist.TestSuiteEdit;
import com.example.todolist.test.testcase.login.TestSuiteLogin;
import com.zutubi.android.junitreport.JUnitReportTestRunner;

import junit.framework.TestSuite;

public class Runner1 extends JUnitReportTestRunner{

	@Override
	public TestSuite getAllTests() {
		// TODO Auto-generated method stub
		TestSuite suite = new TestSuite();
		suite.addTest(TestSuiteLogin.getTestSuiteLogin());
		//suite.addTest(TestSuiteAdd.getTestSuiteAdd());
		//suite.addTest(TestSuiteEdit.getTestSuiteEdit());
		return suite;
		
				
	}

	
	
}
