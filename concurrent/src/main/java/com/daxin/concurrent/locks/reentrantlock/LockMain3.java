package com.daxin.concurrent.locks.reentrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 参考的网址：http://www.cnblogs.com/aishangJava/p/6555291.html
 * java.util.concurrent.locks一共有10个类：
 * 
 * java.util.concurrent.locks.AbstractOwnableSynchronizer
 * java.util.concurrent.locks.AbstractQueuedLongSynchronizer
 * java.util.concurrent.locks.AbstractQueuedSynchronizer
 * java.util.concurrent.locks.Condition java.util.concurrent.locks.Lock
 * java.util.concurrent.locks.LockSupport //单独的类
 * java.util.concurrent.locks.ReadWriteLock //单独的接口
 * java.util.concurrent.locks.ReentrantLock //实现了Lock
 * java.util.concurrent.locks.ReentrantReadWriteLock
 * java.util.concurrent.locks.StampedLock //1.8
 * java.util.concurrent.locks.ReentrantReadWriteLock
 * ReentrantReadWriteLock.WriteLock ReentrantReadWriteLock.ReadLock
 * 
 * tryLock(long time, TimeUnit unit)的使用,另一个可以在等待时间中获取锁
 */

public class LockMain3 {
	private Lock lock = new ReentrantLock();

	public static void main(String[] args) {
		LockMain3 lm = new LockMain3();
		MyThread threadA = new MyThread(lm, "A");
		MyThread threadB = new MyThread(lm, "B");
		threadA.start();
		threadB.start();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main 睡眠完毕....");
	
		threadB.interrupt();
	}

	public void insert(Thread thread) throws InterruptedException {
		// 注意，如果需要正确中断等待锁的线程，必须将获取锁放在外面，然后将 InterruptedException 抛出
		this.lock.lockInterruptibly();
		try {
			System.out.println("线程 " + thread.getName() + "得到了锁...");
			long startTime = System.currentTimeMillis();
			for (;;) { // 耗时操作
				if (System.currentTimeMillis() - startTime >= Integer.MAX_VALUE)
					break;
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(2000);
				// 插入数据
			}
		} finally {
			System.out.println(Thread.currentThread().getName() + "执行finally...");
			this.lock.unlock();
			System.out.println("线程 " + thread.getName() + "释放了锁");
		}
		System.out.println("over");
	}
}

class MyThread extends Thread {
	/**
	 * 锁
	 */
	public LockMain3 lm = null;

	public MyThread(LockMain3 lm, String name) {
		super(name);
		this.lm = lm;
	}

	@Override
	public void run() {
		try {
			lm.insert(Thread.currentThread());
		} catch (InterruptedException e) {
			System.out.println("线程 " + Thread.currentThread().getName() + "被中断...");
		}
	}
}
