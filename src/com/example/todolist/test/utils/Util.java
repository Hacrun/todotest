package com.example.todolist.test.utils;

import com.robotium.solo.Solo;

import android.app.Instrumentation;
import android.app.KeyguardManager;
import android.app.KeyguardManager.KeyguardLock;
import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.test.InstrumentationTestCase;
import android.util.Log;

public class Util {

	public void waitForViewNotNull(long time,Solo solo, int id) {
		long timeout = System.currentTimeMillis() + time;
		while ((solo.getCurrentActivity().findViewById(id) == null) && System.currentTimeMillis() < timeout)
			;
	}
	
	public void waitForViewShown(long time,Solo solo, int id){
		waitForViewNotNull(time,solo,id);
		long timeout = System.currentTimeMillis() + time;
		if(solo.getCurrentActivity().findViewById(id) != null){
			while (solo.getCurrentActivity().findViewById(id).isShown() && System.currentTimeMillis() < timeout)
				;
		}
	}
	
	/**
	 * 唤醒设备的方法
	 * @param owner
	 * @return
	 */
	public static WakeLock wakeScreen(InstrumentationTestCase owner) {
		PowerManager pm = (PowerManager) owner.getInstrumentation()
				.getTargetContext().getSystemService(Context.POWER_SERVICE);
		WakeLock wakeLock = pm.newWakeLock(PowerManager.SCREEN_BRIGHT_WAKE_LOCK
				| PowerManager.FULL_WAKE_LOCK
				| PowerManager.ACQUIRE_CAUSES_WAKEUP, owner.getClass()
				.getSimpleName());
		wakeLock.acquire();
		return wakeLock;
	}

	/**
	 * 解锁的方法
	 * @param instr
	 */
	public static void unlock(Instrumentation instr) {
		try {
			Context targetContext = instr.getTargetContext();
			KeyguardManager keyGuardManager = (KeyguardManager) targetContext
					.getSystemService(Context.KEYGUARD_SERVICE);
			KeyguardLock mLock = keyGuardManager.newKeyguardLock("");
			mLock.disableKeyguard();
		} catch (Throwable e) {
			Log.e("TEST", "unlock failed:", e);
		}
	}
}
