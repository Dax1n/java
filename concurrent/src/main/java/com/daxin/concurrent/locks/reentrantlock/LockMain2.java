package com.daxin.concurrent.locks.reentrantlock;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock; //实现Lock接口
import java.util.concurrent.locks.ReentrantReadWriteLock;//实现ReadWriteLock接口

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
 * 
 * tryLock(long time, TimeUnit unit)可以在等待的过程中被中断
 * 
 */

public class LockMain2 {

	private ArrayList<Integer> arrayList = new ArrayList<Integer>();
	private Lock lock = new ReentrantLock();

	public static void main(String[] args) {

		LockMain2 lm = new LockMain2();

		new Thread("A") {
			public void run() {
				lm.insert(Thread.currentThread());
			};
		}.start();

		new Thread("B") {
			public void run() {
				lm.insert(Thread.currentThread());
			};
		}.start();

	}

	public void insert(Thread thread) {
//		lock.lockInterruptibly();//lockInterruptibly可以相应中断，就是在没有获取锁的时候中断其等待
		try {
			if (lock.tryLock(4,TimeUnit.SECONDS)) { // 使用 tryLock()
				try {
					System.out.println("线程" + thread.getName() + "得到了锁...");
					for (int i = 0; i < 5; i++) {
						arrayList.add(i);
					}
				} catch (Exception e) {
					e.printStackTrace();

				} finally {
					System.out.println("线程" + thread.getName() + "释放了锁...");
					lock.unlock();
				}
			} else {
				System.out.println("线程" + thread.getName() + "获取锁失败...");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
