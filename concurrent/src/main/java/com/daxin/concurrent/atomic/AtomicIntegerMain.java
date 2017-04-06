package com.daxin.concurrent.atomic;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 实现原理
 * 
 * AtomicInteger其底层就是volatile和CAS 共同作用的结果：
 * 
 * 1.首先使用了volatile 保证了内存可见性。
 * 
 * 2.然后使用了CAS（compare-and-swap）算法 保证了原子性(Unsafe实例负责CAS)。
 * 
 * 其中CAS算法的原理就是里面包含三个值：内存值A 预估值V 更新值 B 当且仅当 V == A 时，V = B; 否则，不会执行任何操作。
 *
 */
public class AtomicIntegerMain {
	public static void main(String[] args) throws InterruptedException {
		AtomicInteger at = new AtomicInteger(0);
		
		ConcurrentHashMap<Integer, Integer> cm=new ConcurrentHashMap<>();
		

		Thread t1 = new Thread(() -> {
			while (true) {
				System.out.println("1->  " + at.getAndIncrement());

			}

		});

		Thread t2 = new Thread(() -> {
			while (true) {
				System.out.println("2->  " + at.getAndIncrement());

			}

		});

		Thread t3 = new Thread(() -> {
			while (true) {
				System.out.println("3->  " + at.getAndIncrement());

			}

		});
		
		t1.setDaemon(true);
		t2.setDaemon(true);
		t3.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
		
		Thread.sleep(20);
		
		
		

	}
}
