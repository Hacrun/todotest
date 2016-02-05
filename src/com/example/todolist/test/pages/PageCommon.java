package com.example.todolist.test.pages;

import com.robotium.solo.Solo;

public class PageCommon {
	
	private Solo solo;
	
	public PageCommon(Solo solo){
		this.solo = solo;
	}
	
	public void waitForText(String text){
		solo.waitForText(text);
	}
	
	public  Boolean searchText(String text){
		return solo.searchText(text,true);
	}
	
	public void clickOnEdit(){
		solo.clickOnText("±à¼­");
	}
}
