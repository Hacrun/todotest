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
	//����list�еĵ�index���ı�
	public String getToDoDetail(int index){
		TextView tv = (TextView) list.getChildAt(index-1).findViewById(R.id.toDoItemDetailTv);
		return tv.getText().toString();
	}
	//�����ı��ж��ǵڼ���
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
//				System.out.println("��ǰ�ı�����Ϊ:"+list.getChildCount());
				solo.waitForText("MainActivity");
				TextView tv = (TextView) solo.getView(R.id.toDoItemDetailTv);
				solo.clickLongOnView(tv);
				solo.waitForText("ɾ��");
				solo.clickOnText("ɾ��");
				solo.waitForText("ȷ��");
				solo.clickOnButton("ȷ��");
				System.out.println(tv.getText().toString());
			}
		}
	}
	
}
