package com.example.todolist.test.testcase.addtodolist;

import com.example.todolist.LoginActivity;
import com.example.todolist.test.test.BasicTestCase;
import com.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;

public class AddTestCase extends BasicTestCase {

	public void testAddText(){
		
		uiHelper.getPageCommon().waitForText("ToDoList");
		uiHelper.getPageLogin().clearName();
		uiHelper.getPageLogin().enterName("1");
		uiHelper.getPageLogin().clearPwd();
		uiHelper.getPageLogin().enterPwd("1");
		uiHelper.getPageLogin().ClickLogin();
		
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
