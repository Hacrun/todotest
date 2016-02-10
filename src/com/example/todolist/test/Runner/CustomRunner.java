package com.example.todolist.test.Runner;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.zutubi.android.junitreport.JUnitReportTestRunner;

import android.os.Bundle;
import android.os.Environment;
import junit.framework.TestSuite;

public class CustomRunner extends JUnitReportTestRunner{
	boolean isNeedRegenerate = false;
	public static String VALUE_FROM_COMMAND_LINE = "isNeedReGenerate";

	@Override
	public void onCreate(Bundle arguments) {
		// TODO Auto-generated method stub
		if("true".equalsIgnoreCase(arguments.getString(VALUE_FROM_COMMAND_LINE))){
			isNeedRegenerate = true;
		}
		super.onCreate(arguments);
	}
	//从crash文件中读取crash的测试用例的名字
	public String getCrashCaseName(){
		String caseName = "";
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(Environment.getExternalStorageDirectory() + "/"+"crash.txt");
			br = new BufferedReader(fr);
			caseName = br.readLine();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return caseName;
	}
	//返回所有suite中的casename
	public  List<String> getCaseNameList(TestSuite suite){
		List<String> caseNameList = new ArrayList<String>();
		for(int i=0; i < suite.testCount(); i++){
			for(int j=0; j < ((TestSuite)suite.testAt(i)).testCount(); j++){
				String caseName = ((TestSuite)suite.testAt(i)).testAt(j).toString();
				caseNameList.add(caseName);
			}
		}
		caseNameList.add("com.example.todolist.test.test.FinalTest");
		return caseNameList;

	}
	
	public TestSuite regenerateTestCaseList(TestSuite suite){
		TestSuite newSuite = new TestSuite();
		List<String> caseNameList = getCaseNameList(suite);
		boolean startAddCaseFlag = false;
		for(String casename : caseNameList){
			if(casename.contains(getCrashCaseName())){
				startAddCaseFlag = true;
				continue;
			}
			if (startAddCaseFlag) {
				try {
					newSuite
							.addTestSuite((Class<? extends junit.framework.TestCase>) Class
									.forName(casename));
				} catch (ClassNotFoundException e) { 
					e.printStackTrace();
				}
			}
		}
		return newSuite;
	}

	
}

