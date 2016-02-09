package com.example.todolist.test.pages;

import com.example.todolist.R;
import com.robotium.solo.Solo;

import android.widget.Button;
import android.widget.EditText;

public class PageAdd {

	private Solo solo;
	private EditText detailET;
	private Button saveBtn;
	
	public PageAdd(Solo solo){
		this.solo = solo;
	}
	
	public void initViews(){
		detailET = (EditText) solo.getView(R.id.toDoItemDetailET);
		saveBtn = (Button) solo.getView(R.id.saveBtn);
	}
	
	public void enterToDetail(String detail){
		//solo.waitForText("NewToDoList");
		solo.enterText(detailET, detail);
	}
	
	public void clearToDetail(){
		solo.clearEditText(detailET);
	}
	
	public void clickSaveDetail(){
		solo.clickOnView(saveBtn);
	}
	
	public String getTextDetail(){
		return detailET.getText().toString();
	}
}









