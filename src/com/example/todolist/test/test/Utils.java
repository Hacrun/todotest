package com.example.todolist.test.test;

import com.robotium.solo.Solo;

import android.util.Log;

public class Utils {

	//等待某个元素，设置超时时间
	public static void waitForTimeNotNull(long time, Solo solo, int id){
		long timeout = System.currentTimeMillis() + time;
		while((solo.getCurrentActivity().findViewById(id) == null) && (System.currentTimeMillis() < timeout )){
			Log.i("test", "================"+"a");
		}
	}
	
	//某元素不为空，但是隐藏的，需要等待展示出来
	public static void waitForViewShown(long time, Solo solo, int id){
		waitForTimeNotNull(time, solo, id);
		long timeout = System.currentTimeMillis() + time;
		if(solo.getCurrentActivity().findViewById(id) != null){
			while((solo.getCurrentActivity().findViewById(id).isShown()) && System.currentTimeMillis() < timeout);
		}
	}
}
