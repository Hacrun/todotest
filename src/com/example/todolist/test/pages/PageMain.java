package com.example.todolist.test.pages;

import com.example.todolist.R;
import com.robotium.solo.Solo;

import android.widget.ListView;
import android.widget.TextView;

public class PageMain {

	private Solo solo;
	private TextView addTextView;
	private ListView list;
	
	public PageMain(Solo solo){
		this.solo = solo;
	}
	
	public void initViews(){
		addTextView = (TextView) solo.getView(R.id.action_new);
		list = (ListView) solo.getView(R.id.todoListView);
	}
	
	public void clickAddTextView(){
		solo.clickOnView(addTextView);
	}
	//返回list中的第index个文本
	public String getToDoDetail(int index){
		TextView tv = (TextView) list.getChildAt(index-1).findViewById(R.id.toDoItemDetailTv);
		return tv.getText().toString();
	}
	//根据文本判断是第几个
	public int getIndexFromToDoText(String text){
		for(int i=0; i<list.getChildCount()-1; i++){
			TextView tv = (TextView)list.getChildAt(i).findViewById(R.id.toDoItemDetailTv);
			if(text.equals(tv.getText().toString())){
				return i;
			}
		}
		return -1;
	}
	
	public void clickRow(int row){
		solo.clickInList(row - 1, 0);
	}
	
	public TextView getAddTV(){
		return addTextView;
	}
	
	public void clickLongListTV(String text){
		solo.clickLongOnText(text);
	}
	
	public void delAllText(){
		if(list.getChildCount() != 0){
			int list1 = list.getChildCount();
			for(int i=0; i<list1; i++){
//				System.out.println(i);
//				System.out.println("当前文本数量为:"+list.getChildCount());
				solo.waitForText("MainActivity");
				TextView tv = (TextView) solo.getView(R.id.toDoItemDetailTv);
				solo.clickLongOnView(tv);
				solo.waitForText("删除");
				solo.clickOnText("删除");
				solo.waitForText("确认");
				solo.clickOnButton("确认");
				System.out.println(tv.getText().toString());
			}
		}
	}
	
}
