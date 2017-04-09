package com.daxin.concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 
 * @author daxin
 * 
 * @email leodaxin@163com
 * 
 * @date 2017年4月6日 下午5:14:08
 * 
 *       ExecutorService esd =
 *       Executors.unconfigurableExecutorService(es)，代理指定的ExecutorService
 * 
 * 
 *       es1 : java.util.concurrent.ThreadPoolExecutor es2 :
 *       java.util.concurrent.ThreadPoolExecutor es3
 *       :java.util.concurrent.Executors$FinalizableDelegatedExecutorService
 *       es4: java.util.concurrent.ForkJoinPool es5
 *       :java.util.concurrent.ScheduledThreadPoolExecutor es6
 *       :java.util.concurrent.Executors$DelegatedScheduledExecutorService
 */
public class ExecutorsMain {
	static AtomicInteger at = new AtomicInteger(1);

	public static void main(String[] args) {

		// 创建newCachedThreadPool线程池使用的消息队列是：SynchronousQueue
		ExecutorService es1 = Executors.newCachedThreadPool();
		// 线程池的消息队列：LinkedBlockingQueue
		ExecutorService es2 = Executors.newFixedThreadPool(2);
		ExecutorService es3 = Executors.newSingleThreadExecutor();// newSingle*返回的是ExecutorService的代理对象
		ExecutorService es4 = Executors.newWorkStealingPool();
		ExecutorService es5 = Executors.newScheduledThreadPool(2);
		ExecutorService es6 = Executors.newSingleThreadScheduledExecutor();// newSingle*返回的是ExecutorService的代理对象

		System.out.println("es1 : " + es1.getClass().getName());
		System.out.println("es2 : " + es2.getClass().getName());
		System.out.println("es3 : " + es3.getClass().getName());
		System.out.println("es4 : " + es4.getClass().getName());
		System.out.println("es5 : " + es5.getClass().getName());
		System.out.println("es6 : " + es6.getClass().getName());

		System.out.println("------------------------------------------");

		BlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(20);
		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4, 20, TimeUnit.SECONDS, queue);
		// Executors.FinalizableDelegatedExecutorService 构造器是包权限的，无法实例化
		ForkJoinPool sjp = new ForkJoinPool(2);
		ScheduledThreadPoolExecutor stpe = new ScheduledThreadPoolExecutor(5);
		// Executors.DelegatedScheduledExecutorService 构造器是包权限的，无法实例化

		System.out.println("---------------------------------------------------------");

		Runnable task = new Runnable() {

			@Override
			public void run() {
				System.out.println("任务开始...." + at.getAndIncrement());
				try {
					Thread.sleep(5000);// 模拟耗时操作
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("任务结束....");

			}
		};

		/*
		 * 测试es5线程池是否会自动添加线程，结论是不会 System.out.println(); 每一次只能运行两个任务
		 * es5.submit(task); es5.submit(task); es5.submit(task);
		 * es5.submit(task); es5.submit(task); es5.submit(task);
		 * es5.submit(task);
		 * 
		 * es5.shutdown();
		 * 
		 */

		/*
		 * System.out.println(); 可以自动添加线程，任务可以其次全提交 es1.submit(task);
		 * es1.submit(task); es1.submit(task); es1.submit(task);
		 * es1.submit(task); es1.submit(task); es1.submit(task);
		 * 
		 * es1.shutdown();
		 */
	}

}
