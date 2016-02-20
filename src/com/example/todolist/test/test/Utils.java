package com.example.todolist.test.test;

import com.robotium.solo.Solo;

import android.util.Log;

public class Utils {

	//�ȴ�ĳ��Ԫ�أ����ó�ʱʱ��
	public static void waitForTimeNotNull(long time, Solo solo, int id){
		long timeout = System.currentTimeMillis() + time;
		while((solo.getCurrentActivity().findViewById(id) == null) && (System.currentTimeMillis() < timeout )){
			Log.i("test", "================"+"a");
		}
	}
	
	//ĳԪ�ز�Ϊ�գ��������صģ���Ҫ�ȴ�չʾ����
	public static void waitForViewShown(long time, Solo solo, int id){
		waitForTimeNotNull(time, solo, id);
		long timeout = System.currentTimeMillis() + time;
		if(solo.getCurrentActivity().findViewById(id) != null){
			while((solo.getCurrentActivity().findViewById(id).isShown()) && System.currentTimeMillis() < timeout);
		}
	}
}
