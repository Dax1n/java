package com.daxin.concurrent.collection;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/** 
 * 
 * @author  daxin 
 * 
 * @email leodaxin@163com
 * 
 * @date 2017年4月10日 下午3:50:46
 * 
 * 
 * CopyOnWriteArrayList实现：
 * 		CopyOnWriteArrayList中有一把锁： final transient ReentrantLock lock = new ReentrantLock();
 * 		
 *  add：在CopyOnWriteArrayList执行add操作时候，获取到lock进行控制互斥访问，复制现有的数据，然后将需要写的数据写到新的容器中
 *  
 *  get：对于并发读不需要锁
 * 
 * 
 * 
 */
public class CopyOnWriteArrayListMain {
	public static void main(String[] args) {
		
		CopyOnWriteArrayList<Integer> co=new CopyOnWriteArrayList<>();
		
		co.add(1);//复制写，就是每一次并发写时候都拷贝一份当前的副本
		co.add(1);//add的实现，
		co.add(1);
		co.add(1);
		System.out.println(co.size());
		co.get(1);
		co.add(1);
		co.add(1);
		System.out.println(co.size());
		co.add(1);
		co.add(1);
		
	}

}
