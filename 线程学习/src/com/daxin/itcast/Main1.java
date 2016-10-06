package com.daxin.itcast;

/**
 * 
 * 这个是看传智播客的java课程的代码
 * 
 * @author 青春常驻Dax1n
 *
 */
public class Main1 {
	
	public static void main(String[] args) {
		
		//主线程的名字是main，在非线程对象中获取当前线程名字使用Thread.currentThread()
		System.out.println(Thread.currentThread().getName());
		//可以修改主线程名字
		Thread.currentThread().setName("dax1n");
		//线程的getName和setName是在Thread中实现的，所以在Runnable中使用不了getName
		//只能使用Thread.currentThread().getName()
		System.out.println(Thread.currentThread().getName());
		
	}

}
