package com.daxin.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/** 
 * 
 * @author  daxin 
 * 
 * @email leodaxin@163com
 * 
 * @date 2017年4月8日 下午6:48:49
 * 
 */
public class ScheduledFutureTaskMain {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
//		DaxinDaemonThreadFactory threadFactory = new DaxinDaemonThreadFactory();//这个是守护线程线程池，当初第一次调度使用的是这个线程工厂，每次都不调度。切记不可守护线程
		NewScheduledThreadPoolThreadFactory threadFactory = new NewScheduledThreadPoolThreadFactory();
		
		/**
		 * 创建时候ScheduledThreadPoolExecutor使用的的实现DelayedWorkQueue任务队列
		 */
		ScheduledExecutorService nst = Executors.newScheduledThreadPool(4, threadFactory);
		
//		System.out.println(nst.getClass().getName());
		
		
		Callable<Integer> callable=new Callable<Integer>() {
			
			int i=0;

			@Override
			public Integer call() throws Exception {
			 
				System.out.println("running ...."+i);
				return i++;
			}
			
		 
		};
		
		  ScheduledFuture<Integer> rs = nst.schedule(callable, 5, TimeUnit.SECONDS);
		System.out.println(rs.getClass().getName());

		  while(!rs.isDone()){
			  Thread.sleep(1000);
		  }
		  
		  System.out.println(rs.get());

		  nst.shutdown();

		 
		
		
	}

}
