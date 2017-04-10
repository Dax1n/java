package com.daxin.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * 
 * @author daxin
 * 
 * @email leodaxin@163com
 * 
 * @date 2017��4��10�� ����4:59:38
 * 
 */

class RunnableTask implements Runnable{

	@Override
	public void run() {
		
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 System.out.println("RunnableTask run....");
		
	}
	
}


public class CallbleTask implements Callable<Integer> {
	/**
	 * ����ʱ��
	 */
	private int sleepSeconds;
	/**
	 * ���ص�ֵ
	 */
	private int returnValue;

	public CallbleTask(int sleepSeconds, int returnValue) {
		this.sleepSeconds = sleepSeconds;
		this.returnValue = returnValue;
	}

	@Override
	public Integer call() throws Exception {
		System.out.println("begin to execute.");

		TimeUnit.SECONDS.sleep(sleepSeconds);

		System.out.println("end to execute.");

		return returnValue;
	}
}
