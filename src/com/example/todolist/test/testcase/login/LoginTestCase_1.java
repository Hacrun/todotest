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
		//assertTrue("û�е�¼�ɹ�", solo.searchText("�û��������������", true));
		assertTrue("û�е�¼�ɹ�", uiHelper.getPageCommon().searchText("�û��������������"));
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	
	
}
