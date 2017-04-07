package com.daxin.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 
 * 自己实现的自定义线程工厂，用于定制线程的属性。 <br>
 * 例如设置线程的名字，完成以后分析程序时候容易根据当前线程名字判断当前线程的职责<br>
 * 
 * @author Daxin
 *
 */
class DaxinDaemonThreadFactory implements ThreadFactory {

	AtomicInteger at = new AtomicInteger(1);

	@Override
	public Thread newThread(Runnable r) {

		Thread needThread = new Thread(r);
		needThread.setDaemon(true);
		needThread.setName("daxin--" + at.getAndIncrement());
		return needThread;
	}
}

/**
 * 
 * @author daxin
 * 
 * @email leodaxin@163com
 * 
 * @date 2017年4月7日 下午7:34:07
 * 
 */
public class NewFixedThreadPoolMain {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		DaxinDaemonThreadFactory threadFactory = new DaxinDaemonThreadFactory();

		/**
		 * newFixedThreadPool的内部创建ThreadPoolExecutor使用的是LinkedBlockingQueue消息队列
		 */
		ExecutorService fixPool = Executors.newFixedThreadPool(4, threadFactory);

		System.out.println(fixPool.getClass().getName());
		Runnable task = new Runnable() {

			@Override
			public void run() {
				System.out.println("哈哈哈哈哈哈哈哈.....");

			}
		};
		/**
		 * 提交Runnable任务是没有结果的
		 */
		Future<?> rs = fixPool.submit(task);

		while (!rs.isDone()) {

		}

		System.out.println(rs.get());

		fixPool.shutdown();

	}

}
