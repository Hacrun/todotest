package com.example.todolist.test.testcase.login;

import com.example.todolist.test.test.BasicTestCase;


public class LoginTestCase2 extends BasicTestCase {

	public void testLoginSuccess(){
		uiHelper.getPageLogin().Login("1", "1");
		assertTrue(uiHelper.getPageCommon().searchText("MainActivity"));
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
