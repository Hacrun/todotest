package com.example.todolist.test.testcase.login;

import com.example.todolist.test.test.BasicTestCase;

public class LoginTestCase_1 extends BasicTestCase {


	public void testtestCase1(){
		uiHelper.getPageLogin().Login("abcd","1234");
		assertTrue("û�е�¼�ɹ�", uiHelper.getPageCommon().searchText("�û��������������"));
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	
	
}
