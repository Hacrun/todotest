package com.example.todolist.test.testcase.login;

import com.example.todolist.test.test.BasicTestCase;


public class LoginTestCase2 extends BasicTestCase {

	public void testLoginSuccess(){
		uiHelper.getPageCommon().waitForText("ToDoList");
		uiHelper.getPageLogin().clearName();
		uiHelper.getPageLogin().enterName("1");
		uiHelper.getPageLogin().clearPwd();
		uiHelper.getPageLogin().enterPwd("1");
		uiHelper.getPageLogin().ClickLogin();
		assertTrue(uiHelper.getPageCommon().searchText("MainActivity"));
	}
	
	protected void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}

}
