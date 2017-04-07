package com.daxin.concurrent;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 不能设置线程工厂是守护线程，否则当主线程退出就不会调度了。
 * 
 * @author Daxin
 *
 */
class NewScheduledThreadPoolThreadFactory implements ThreadFactory{

	AtomicInteger at = new AtomicInteger(1);
	@Override
	public Thread newThread(Runnable r) {
		Thread needThread = new Thread(r);
		needThread.setName("daxin--" + at.getAndIncrement());
		return needThread;
	}
	
}

/** 
 * 
 * @author  daxin 
 * 
 * @email leodaxin@163com
 * 
 * @date 2017年4月7日 下午7:51:20
 * 
 */
public class NewScheduledThreadPoolMain {
	
	public static void main(String[] args) {
		
//		DaxinDaemonThreadFactory threadFactory = new DaxinDaemonThreadFactory();//这个是守护线程线程池，当初第一次调度使用的是这个线程工厂，每次都不调度。切记不可守护线程
		NewScheduledThreadPoolThreadFactory threadFactory = new NewScheduledThreadPoolThreadFactory();
		
		/**
		 * 创建时候ScheduledThreadPoolExecutor使用的的实现DelayedWorkQueue任务队列
		 */
		ScheduledExecutorService nst = Executors.newScheduledThreadPool(4, threadFactory);
		
//		System.out.println(nst.getClass().getName());
		
		
		Runnable command=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
					System.out.println("running ....");
				
			}
		};
		
		ScheduledFuture<?> rs = nst.scheduleAtFixedRate(command, 1, 2, TimeUnit.SECONDS);
		
		
		
		
	}

}
