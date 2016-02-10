package com.example.todolist.test.test;

import java.io.File;

import android.os.Environment;

public class FinalTest extends BasicTestCase{

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		File fileName = new File(Environment.getExternalStorageDirectory() + "/" + "Crash.txt");
		if(fileName.exists()){
			fileName.delete();
		}
	}
	
	public void testFinal(){
		System.out.println("delete crash txt£¡£¡");
	}
}
