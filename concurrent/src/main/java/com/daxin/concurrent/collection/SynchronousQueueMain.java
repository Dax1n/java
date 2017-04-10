package com.daxin.concurrent.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/**
 * 
 * @author daxin
 * 
 * @email leodaxin@163com
 * 
 * @date 2017年4月9日 下午1:35:02
 * 
 * @blog http://blog.csdn.net/dax1n/article/details/69813682
 * 
 * <br><br>
 * 
 *       不可以使用的API sc.peek();// Always returns null sc.clear(); sc.contains(1);
 *       sc.containsAll(new ArrayList<Integer>()); sc.isEmpty(); sc.size();
 *       sc.toArray(); Integer [] in=new Integer[]{new Integer(2)};
 *       sc.toArray(in); sc.removeAll(new ArrayList<Integer>());
 *       sc.retainAll(new ArrayList<Integer>()); sc.remove("a"); sc.peek();
 * 
 * 
 * 
 */
public class SynchronousQueueMain {
	public static void main(String[] args) throws Exception {

		// 如果为 true，则等待线程以 FIFO 的顺序竞争访问；否则顺序是未指定的。
		// SynchronousQueue<Integer> sc =new SynchronousQueue<>(true);//fair

		SynchronousQueue<Integer> sc = new SynchronousQueue<>(); // 默认不指定的话是false，不公平的

		new Thread(() -> {
			while (true) {
				try {
					sc.put(new Random().nextInt(50));
					//将指定元素添加到此队列，如有必要则等待另一个线程接收它。
					// System.out.println("sc.offer(new Random().nextInt(50)): "+sc.offer(new Random().nextInt(50))); 
					// 如果另一个线程正在等待以便接收指定元素，则将指定元素插入到此队列。如果没有等待接受数据的线程则直接返回false
					// System.out.println("sc.offer(2,5,TimeUnit.SECONDS):
					// "+sc.offer(2,5,TimeUnit.SECONDS));//如果没有等待的线程，则等待指定的时间。在等待时间还没有接受数据的线程的话，直接返回false
					System.out.println("添加操作运行完毕...");//是操作完毕，并不是添加或获取元素成功!
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();

		new Thread(() -> {
			while (true) {
				try {
					System.out.println("-----------------> sc.take: " + sc.take());
					System.out.println("-----------------> 获取操作运行完毕...");//是操作完毕，并不是添加或获取元素成功!
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();

	}

}
