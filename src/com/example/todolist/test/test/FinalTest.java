package com.example.todolist.test.test;

import java.io.File;

import android.os.Environment;

public class FinalTest extends BasicTestCase{

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		File file = new File(Environment.getExternalStorageDirectory() + "/" + "crash.txt");
		System.out.println(file.getName().toString());
		Thread.sleep(5000);
		System.out.println("wait five second");
		if(file.exists()){
			file.delete();
		}
	}
	
	public void testFinal(){
		System.out.println("delete crash txt£¡£¡");
	}
}
