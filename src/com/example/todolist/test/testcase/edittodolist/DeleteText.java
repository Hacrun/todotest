package com.example.todolist.test.testcase.edittodolist;

import com.example.todolist.test.test.BasicTestCase;

public class DeleteText extends BasicTestCase{

	public void testDelText(){
		uiHelper.getPageLogin().Login("1", "1");
		uiHelper.getPageMain().delAllText();
		assertTrue("没有全部删除成功！！", uiHelper.getSolo().searchText("没有待办事项"));
	}
	
}
