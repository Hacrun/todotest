package com.example.todolist.test;

import com.example.todolist.LoginActivity;
import com.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;

public class AddTestCase extends ActivityInstrumentationTestCase2<LoginActivity> {

	private Solo solo;
	
	public AddTestCase() {
		super(LoginActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation(), getActivity());		
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
		solo.finishOpenedActivities();
	}

}
