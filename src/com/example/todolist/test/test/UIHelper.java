package com.example.todolist.test.test;

import com.example.todolist.test.pages.PageAdd;
import com.example.todolist.test.pages.PageCommon;
import com.example.todolist.test.pages.PageEdit;
import com.example.todolist.test.pages.PageLogin;
import com.example.todolist.test.pages.PageMain;
import com.robotium.solo.Solo;

public class UIHelper {

	private PageLogin pageLogin;
	private PageAdd pageAdd;
	private PageMain pageMain;
	private PageCommon pageCommon;
	private PageEdit pageEdit;
	
	private Solo solo;
	
	public UIHelper(Solo solo){
		this.solo = solo;
	}
	
	public Solo getSolo(){
		return solo;
	}
	
	public PageLogin getPageLogin(){
		if(pageLogin == null){
			pageLogin = new PageLogin(solo);
		}
		pageLogin.initViews();
		return pageLogin;
	}
	
	public PageAdd getPageAdd(){
		if(pageAdd == null){
			pageAdd = new PageAdd(solo);
		}
		pageAdd.initViews();
		return pageAdd;
	}
	
	public PageMain getPageMain(){
		if(pageMain == null){
			pageMain = new PageMain(solo);
		}
		pageMain.initViews();
		return pageMain;
	}
	
	public PageEdit getPageEdit(){
		if(pageEdit == null){
			pageEdit = new PageEdit(solo);
		}
		pageEdit.initViews();
		return pageEdit;
	}
	
	public PageCommon getPageCommon(){
		if(pageCommon == null){
			pageCommon = new PageCommon(solo);
		}
		return pageCommon;
	}
	
	
	
	
	
	
	
	
	
	
}
