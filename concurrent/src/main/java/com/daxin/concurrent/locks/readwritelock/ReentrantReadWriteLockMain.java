package com.daxin.concurrent.locks.readwritelock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 参考网站：http://www.cnblogs.com/aishangJava/p/6555291.html
 * 
 * @author Daxin
 * 
 *         ReadWriteLock也是一个接口，里面两个方法： Lock readLock(); Lock writeLock();
 * 
 *         实现类：ReentrantReadWriteLock，ReentrantReadWriteLock
 *         里面提供了很多丰富的方法，不过最主要的有两个方法：readLock()和writeLock()用来获取读锁和写锁。
 * 
 * 
 *         <br>
 * 
 *         一个用来获取读锁，一个用来获取写锁。也就是说，将对临界资源的读写操作分成两个锁来分配给线程，从而使得多个线程可以同时进行读操作。
 * 
 * 
 * 
 *         观察的试验现象是：A与B线程可以同时进行读操作。
 *         我们可以看到，线程A和线程B在同时进行读操作，这样就大大提升了读操作的效率。不过要注意的是，如果有一个线程已经占用了读锁，
 *         则此时其他线程如果要申请写锁，则申请写锁的线程会一直等待释放读锁。如果有一个线程已经占用了写锁，则此时其他线程如果申请写锁或者读锁，
 *         则申请的线程也会一直等待释放写锁。
 *
 */

public class ReentrantReadWriteLockMain {

	private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

	public static void main(String[] args) {
		final ReentrantReadWriteLockMain rl = new ReentrantReadWriteLockMain();

		// lambda写法，简单便捷，高效
		new Thread(() -> rl.get(Thread.currentThread()), "A").start();

		new Thread(() -> rl.get(Thread.currentThread()), "B").start();

	}

	public void get(Thread thread) {
		rwl.readLock().lock(); // 在外面获取锁
		
		//查询当前线程在此锁上保持的重入读取锁数量。
		System.out.println("getReadHoldCount : "+rwl.getReadHoldCount());
		//查询为此锁保持的读取锁数量。
		System.out.println("getReadLockCount : "+rwl.getReadLockCount());
//		  返回等待获取读取或写入锁的线程估计数目。
		System.out.println("getQueueLength : "+rwl.getQueueLength());

//		  查询是否某个线程保持了写入锁。
		System.out.println("isWriteLocked : "+rwl.isWriteLocked());
		
		//更多方法看文档
		
		try {
			long start = System.currentTimeMillis();
			System.out.println("线程" + thread.getName() + "开始读操作...");
			while (System.currentTimeMillis() - start <= 1) {
				System.out.println("线程" + thread.getName() + "正在进行读操作...");
			}
			System.out.println("线程" + thread.getName() + "读操作完毕...");
		} finally {
			rwl.readLock().unlock();
		}
	}
}/*
	 * Output: 线程A开始读操作... 线程B开始读操作... 线程A正在进行读操作... 线程A正在进行读操作... 线程B正在进行读操作...
	 * ... 线程A读操作完毕... 线程B读操作完毕...
	 */// :~
