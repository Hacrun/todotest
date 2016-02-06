package com.example.todolist.test.testcase.edittodolist;

import com.example.todolist.test.test.BasicTestCase;

public class EditText_1 extends BasicTestCase {

	public void testTestEdit(){
		uiHelper.getPageLogin().Login("1","1");
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
