package com.example.todolist.test.test;

import com.example.todolist.LoginActivity;
import com.example.todolist.test.utils.NetworkUtil;
import com.example.todolist.test.utils.Util;
import com.robotium.solo.Solo;

import android.os.PowerManager;
import android.test.ActivityInstrumentationTestCase2;

public class BasicTestCase extends ActivityInstrumentationTestCase2<LoginActivity> {

	protected Solo solo;
	private PowerManager.WakeLock wakeScreenObject = null;
	protected UIHelper uiHelper;
	
	public BasicTestCase() {
		super(LoginActivity.class);
	}

	protected void setUp() throws Exception {
		try{
			super.setUp();
			solo = new Solo(getInstrumentation(), getActivity());
			uiHelper = new UIHelper(solo);
			//唤醒设备
			if(wakeScreenObject == null){
				wakeScreenObject = Util.wakeScreen(this);
			}
			//解锁
			Util.unlock(getInstrumentation());
			//连接网络
			NetworkUtil.setAirplaneModeOffAndNetworkOn(getInstrumentation().getTargetContext());
		}catch(Throwable tr){
			throw new SetUpException(tr);
		}
	}
	
	@Override
	protected void runTest() throws Throwable {
		// TODO Auto-generated method stub
		try {
			super.runTest();
		} catch (junit.framework.AssertionFailedError afe) {
			solo.takeScreenshot(this.getClass().getSimpleName());
			throw afe;
		} catch (Throwable th) {
			solo.takeScreenshot(this.getClass().getSimpleName());
			throw new RunTestException(th);
		}
	}
	
	@Override
	public void runBare() throws Throwable {
		try {
			super.runBare();
		} catch (SetUpException smte) {
			solo.takeScreenshot(this.getClass().getSimpleName());
			this.tearDown();
			throw smte;
		}
	}

	protected void tearDown() throws Exception {
		if(wakeScreenObject != null){
			wakeScreenObject.release();
			wakeScreenObject = null;
		}
		solo.finishOpenedActivities();
		super.tearDown();
	}
	
	/*
	 * 三个自定义的异常类，对应setUp()时发生的异常，对应tearDown()时发生的异常，对应runTest()时发生的异常，
	 * */
	class SetUpException extends Exception {
		private static final long serialVersionUID = 1L;

		SetUpException(Throwable e) {
			super("Error in BasicTestCase.setUp()!", e);
		}
	}

	class RunTestException extends Exception {
		private static final long serialVersionUID = 2L;

		RunTestException(Throwable e) {
			super("Error in BasicTestCase.runTest()", e);
		}
	}

	class TearDownException extends Exception {
		private static final long serialVersionUID = 3L;

		TearDownException(Throwable e) {
			super("Error in MultiTestCase.tearDown()", e);
		}
	}

}
