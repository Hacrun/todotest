package com.example.todolist.test.testcase.addtodolist;

import com.example.todolist.test.test.BasicTestCase;

public class AddTestCase extends BasicTestCase {

	public void testAddText(){
		uiHelper.getPageLogin().Login("1","1");
		uiHelper.getPageMain().clickAddTextView();
		uiHelper.getPageAdd().enterToDetail("testOnewEdit");
		uiHelper.getPageAdd().clickSaveDetail();
		assertTrue(uiHelper.getPageCommon().searchText("MainActivity"));
		assertTrue(uiHelper.getPageCommon().searchText("testOnewEdit"));
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
