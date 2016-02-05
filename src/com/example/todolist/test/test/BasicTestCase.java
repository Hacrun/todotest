package com.example.todolist.test.test;

import com.example.todolist.LoginActivity;
import com.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;

public class BasicTestCase extends ActivityInstrumentationTestCase2<LoginActivity> {

	private Solo solo;
	
	public BasicTestCase(Solo solo) {
		super(LoginActivity.class);
		this.solo = solo;
	}

	protected void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation(), getActivity());
	}

	protected void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}

}
