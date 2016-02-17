package com.example.todolist.test.testcase.login;

import com.example.todolist.test.test.BasicTestCase;

public class LoginTestCase_1 extends BasicTestCase {


	public void testtestCase1(){
		uiHelper.getPageLogin().Login("abcd","1234");
		assertTrue("没有登录成功", uiHelper.getPageCommon().searchText("用户名或者密码错误"));
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	
	
}
