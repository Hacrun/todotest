package com.example.todolist.test.pages;

import com.example.todolist.R;
import com.robotium.solo.Solo;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PageLogin {

	private Solo solo;
	private EditText nameET,passwordET;
	private Button loginBtn;
	
	public PageLogin(Solo solo){
		this.solo = solo;
	}
	
	public void initViews(){
		nameET = (EditText) solo.getView(R.id.nameET);
		passwordET = (EditText) solo.getView(R.id.passwordET);
		loginBtn = (Button) solo.getView(R.id.loginBtn);
	}
	
	public TextView getPWD(){
		return passwordET;
	}
	
	public TextView getNAME(){
		return nameET;
	}
	
	public Button getButtonBtn(){
		return loginBtn;
	}
	
	public void enterName(String name){
		solo.enterText(nameET, name);
	}
	
	public void enterPwd(String pwd){
		solo.enterText(passwordET, pwd);
	}
	
	public void clearName(){
		solo.clearEditText(nameET);
	}
	
	public void clearPwd(){
		solo.clearEditText(passwordET);
	}
	
	public void clickLogin(){
		solo.clickOnView(loginBtn);
	}
	
	public String getTextOfNameET(){
		return nameET.getText().toString();
	}
	
	public String getTextOfPwdET(){
		return passwordET.getText().toString();
	}
	
	public void Login(String name, String password){
		solo.waitForText("µ«»Î");
		clearName();
		enterName(name);
		clearPwd();
		enterPwd(password);
		clickLogin();
	}

	
}
