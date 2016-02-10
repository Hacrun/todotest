package com.example.todolist.test.testcase.login;

import com.example.todolist.test.test.BasicTestCase;

public class LoginTestCase_crash_3 extends BasicTestCase{

	public void Login4(){
		android.os.Process.killProcess(android.os.Process.myPid());
	}
}
