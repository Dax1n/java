package com.daxin.concurrent.locks.reentrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/**
 * 参考的网址：http://www.cnblogs.com/aishangJava/p/6555291.html
 * LockMain4是LockMain3的错误实现版本将lock.lockInterruptibly();放到了try中，无法抛出中断异常来相应终端
 *
 */
public class LockMain4 {
	private Lock lock = new ReentrantLock();

	public static void main(String[] args) {
		LockMain4 test = new LockMain4();
		MyThread4 threadA = new MyThread4(test, "A");
		MyThread4 threadB = new MyThread4(test, "B");
		threadA.start();
		threadB.start();

		try {
			Thread.sleep(5000);
			System.out.println("线程" + Thread.currentThread().getName() + " 睡醒了...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		threadB.interrupt();
	}

	/**
	 * 错误所在的位置
	 * @param thread
	 */
	public void insert(Thread thread) {

		try {
			// 注意，如果将获取锁放在try语句块里，则必定会执行finally语句块中的解锁操作。若线程在获取锁时被中断，则再执行解锁操作就会导致异常，因为该线程并未获得到锁。
			lock.lockInterruptibly();//错误版本
			System.out.println("线程 " + thread.getName() + "得到了锁...");
			long startTime = System.currentTimeMillis();
			for (;;) {
				if (System.currentTimeMillis() - startTime >= Integer.MAX_VALUE) // 耗时操作
					break;
				// 插入数据
				Thread.sleep(2000);
			}
		} catch (Exception e) {

		} finally {
			System.out.println(Thread.currentThread().getName() + "执行finally...");
			lock.unlock();
			System.out.println("线程 " + thread.getName() + "释放了锁...");
		}
	}
}

class MyThread4 extends Thread {
	private LockMain4 lm = null;

	public MyThread4(LockMain4 test, String name) {
		super(name);
		this.lm = test;
	}

	@Override
	public void run() {

		lm.insert(Thread.currentThread());
		System.out.println("线程 " + Thread.currentThread().getName() + "被中断...");
	}
}/*
	 * Output: 线程A 得到了锁... 线程main 睡醒了... B执行finally... Exception in thread "B"
	 * java.lang.IllegalMonitorStateException at
	 * java.util.concurrent.locks.ReentrantLock$Sync.tryRelease(Unknown Source)
	 * at java.util.concurrent.locks.AbstractQueuedSynchronizer.release(Unknown
	 * Source) at java.util.concurrent.locks.ReentrantLock.unlock(Unknown
	 * Source) at Test.insert(Test.java:39) at MyThread.run(Test.java:56)
	 */// :~

/*
 * 注意，上述代码就将锁的获取操作放在try语句块里，则必定会执行finally语句块中的解锁操作。在 准备获取锁的 线程B 被中断后，再执行解锁操作就会抛出
 * IllegalMonitorStateException，因为该线程并未获得到锁却执行了解锁操作。
 */
