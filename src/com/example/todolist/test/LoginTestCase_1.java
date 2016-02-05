package com.example.todolist.test;

import junit.framework.TestCase;

import com.example.todolist.LoginActivity;
import com.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;

public class LoginTestCase_1 extends ActivityInstrumentationTestCase2<LoginActivity> {

	private Solo solo;
	
	public LoginTestCase_1() {
		super(LoginActivity.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		solo = new Solo(getInstrumentation(), getActivity());
	}

	public void testtestCase1(){
		solo.enterText(0, "adcd");
		solo.enterText(1, "1234");
		solo.clickOnButton(0);
		assertTrue("没有登录成功", solo.searchText("用户名或者密码错误", true));
	}
	
	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		solo.finishOpenedActivities();
	}

	
	
}
