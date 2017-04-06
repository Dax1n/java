package com.daxin.concurrent.locks;

import java.util.concurrent.locks.LockSupport;

/**
 * 
 * @author daxin
 * 
 * @email leodaxin@163com
 * 
 * @date 2017年4月5日 下午7:18:19
 * 
 * LockSupport私有构造器，不可以实例化
 * 
 * 
 * 
 */
public class LockSupportMain {

	public static void main(String[] args) throws InterruptedException {

		Thread thread1 = new Thread(() -> {
			System.out.println("thread 1 start...");
			LockSupport.park(Thread.currentThread());
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("thread 1 end...");
		});

		thread1.start();
		System.out.println("main thread start,thread1 " + thread1.getState());
		Thread.sleep(2000);
		System.out.println("main thread running,thread1 " + thread1.getState());
		LockSupport.unpark(thread1);
		Thread.sleep(6000);
		System.out.println("main thread end,thread1 " + thread1.getState());
		
		没有理解头侧，改天在学习。状态有点不好，注意力不集中
	}

}
