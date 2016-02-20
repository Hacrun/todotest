package com.example.todolist.test.testcase.login;

import com.example.todolist.test.test.BasicTestCase;
import com.example.todolist.test.test.Utils;

import android.widget.Button;

public class LoginTestCase_4 extends BasicTestCase{

	public void testEquals(){
		Utils.waitForTimeNotNull(3000, solo, com.example.todolist.R.id.loginBtn);
		String actualHint = uiHelper.getPageLogin().getNAME().getHint().toString();	
		assertEquals("�����û���", actualHint);
		solo.enterText(1, "helloworld");
		int actualHintLength = uiHelper.getPageLogin().getPWD().getText().toString().length();
		assertEquals(10, actualHintLength);
		Button loginBtn = (Button) solo.getCurrentActivity().findViewById(com.example.todolist.R.id.loginBtn);
		assertEquals("����", loginBtn.getText().toString());
	}
}
