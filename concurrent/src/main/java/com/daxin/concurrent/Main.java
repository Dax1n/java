package com.daxin.concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 
 * @author daxin
 * 
 * @email leodaxin@163com
 * 
 * @date 2017年4月6日 下午4:35:24
 * 
 */
public class Main {

	public static void main(String[] args) {
		BlockingQueue<Runnable> workQueue =new ArrayBlockingQueue<>(20);
		ThreadPoolExecutor tp=new ThreadPoolExecutor(4, 4, 20, TimeUnit.SECONDS, workQueue );
		Callable<Void> c=new Callable<Void>() {

			@Override
			public Void call() throws Exception {
				//System.out.println("call ...");
				Thread.sleep(1000);
				return null;
			}
		};
		
		Runnable r1=	new Runnable() {
			
			@Override
			public void run() {
				System.out.println("call ...");				
				
			}
		};
		
		
		System.out.println(workQueue.size());
		tp.submit(c);
		tp.submit(c);
		tp.submit(c);
		tp.submit(c);
		tp.submit(r1);
		tp.submit(c);
		tp.submit(c);
		System.out.println(workQueue.size());
		tp.submit(c);
		tp.submit(c);
		tp.submit(c);
		tp.submit(c);
		System.out.println(workQueue.size());
		tp.submit(c);
		tp.submit(c);
		//最后要shutdown线程池
		tp.shutdown();
	}

}
