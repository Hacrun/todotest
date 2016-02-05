package com.example.todolist.test.testcase.addtodolist;

import com.example.todolist.LoginActivity;
import com.example.todolist.test.test.BasicTestCase;
import com.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;

public class AddTestCase extends BasicTestCase {

	public AddTestCase(Solo solo) {
		super(solo);
		// TODO Auto-generated constructor stub
	}

	private Solo solo;

	protected void setUp() throws Exception {
		super.setUp();		
	}
	
	public void testAddText(){
		solo.enterText(0, "1");
		solo.enterText(1, "1");
		solo.clickOnButton(0);
		solo.clickOnView(solo.getView("com.example.todolist:id/action_new"));
		solo.enterText(0, "testOnewEdit");
		solo.clickOnButton("±£´æ");
		assertEquals(true, solo.searchText("MainActivity"));
		assertEquals(true, solo.searchText("testOnewEdit"));
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
