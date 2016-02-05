package com.example.todolist.test.testcase.edittodolist;

import com.example.todolist.EditToDoItemActivity;
import com.example.todolist.LoginActivity;
import com.example.todolist.test.test.BasicTestCase;
import com.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;

public class EditText_1 extends BasicTestCase {

	public void testTestEdit(){
		uiHelper.getPageCommon().waitForText("ToDoList");
		uiHelper.getPageLogin().clearName();
		uiHelper.getPageLogin().enterName("1");
		uiHelper.getPageLogin().clearPwd();
		uiHelper.getPageLogin().enterPwd("1");
		uiHelper.getPageLogin().ClickLogin();
		
		uiHelper.getPageMain().clickAddTextView();
		uiHelper.getPageAdd().enterToDetail("changeText");
		uiHelper.getPageAdd().clickSaveDetail();
		assertTrue(uiHelper.getPageCommon().searchText("changeText"));
		uiHelper.getPageMain().clickLongListTV("changeText");
		uiHelper.getPageCommon().clickOnEdit();
		uiHelper.getPageCommon().searchText("EditToDoItemActivity");
		uiHelper.getPageEdit().clearToDetail();
		uiHelper.getPageEdit().enterToDetail("OneText");
		uiHelper.getPageEdit().clickSaveDetail();
		assertTrue(uiHelper.getPageCommon().searchText("OneText"));
	}
	
	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}
	
	

}
