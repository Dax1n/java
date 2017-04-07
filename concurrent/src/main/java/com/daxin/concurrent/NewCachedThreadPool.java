package com.daxin.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;


class CachedThreadFactory implements ThreadFactory{
	
	AtomicInteger at =new AtomicInteger(0);

	@Override
	public Thread newThread(Runnable r) {
		// TODO Auto-generated method stub
		
		Thread t = new Thread(r);
		t.setName("CachedThread --- "+at.getAndIncrement());
		return t;
	}
	
}
/**
 * 
 * @author daxin
 * 
 * @email leodaxin@163com
 * 
 * @date 2017年4月7日 下午9:55:22
 * 
 */
public class NewCachedThreadPool {

	public static void main(String[] args) {

		// 调度线程方法名newScheduledThreadPool，后缀名是Pool
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);

		// 单个线程是Executor
		ScheduledExecutorService singleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();

		// ---------------------------------------------------------------------------------------------
		
		ExecutorService newCachedThreadPool1 = Executors.newCachedThreadPool();
		
		
		ThreadFactory threadFactory =new CachedThreadFactory();
		ExecutorService newCachedThreadPool2 = Executors.newCachedThreadPool(threadFactory );
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
