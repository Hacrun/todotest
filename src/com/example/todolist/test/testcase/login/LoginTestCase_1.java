package com.example.todolist.test.testcase.login;

import com.example.todolist.test.test.BasicTestCase;

public class LoginTestCase_1 extends BasicTestCase {


	public void testtestCase1(){
		uiHelper.getPageCommon().waitForText("ToDoList");
		uiHelper.getPageLogin().clearName();
		uiHelper.getPageLogin().enterName("abcd");
		uiHelper.getPageLogin().clearPwd();
		uiHelper.getPageLogin().enterPwd("1234");
		uiHelper.getPageLogin().ClickLogin();
		//assertTrue("没有登录成功", solo.searchText("用户名或者密码错误", true));
		assertTrue("没有登录成功", uiHelper.getPageCommon().searchText("用户名或者密码错误"));
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	
	
}
