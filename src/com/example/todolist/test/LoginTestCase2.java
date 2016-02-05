package com.example.todolist.test;

import com.example.todolist.LoginActivity;
import com.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;

public class LoginTestCase2 extends ActivityInstrumentationTestCase2<LoginActivity> {

	private Solo solo;
	
	public LoginTestCase2() {
		super(LoginActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation(), getActivity());
	}

	public void testLoginSuccess(){
		solo.enterText(0, "1");
		solo.enterText(1, "1");
		solo.clickOnButton(0);
		assertEquals(true, solo.searchText("MainActivity"));
	}
	
	protected void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}

}
