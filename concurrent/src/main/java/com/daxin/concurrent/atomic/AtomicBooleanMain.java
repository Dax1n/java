package com.daxin.concurrent.atomic;

import java.util.concurrent.atomic.AtomicBoolean;


/**
 * 
 * 实现原理同AtomicInteger：volatile和CAS 共同作用的结果
 * 
 * @author Daxin
 *
 */
public class AtomicBooleanMain {
	public static void main(String[] args) {
		AtomicBoolean  ab =new AtomicBoolean();
		ab.getAndSet(true);
		System.out.println(ab.get());
		
		//如果当前值==参数1的话，将当前值设置为参数2
		ab.compareAndSet(true, false);
		System.out.println(ab.get());
		
	}

}
