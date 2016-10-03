package com.daxin;

/**
 * 线程的优先级
 * 
 * 默认的有优先级的数值是5
 * 
 * 
 * @author 青春常驻Dax1n
 *
 */
public class Main4 {
	public static void main(String[] args) {

		Thread t1 = new Thread(new Main4Thread1());
		Thread t2 = new Thread(new Main4Thread2());

		// t1.setPriority(Thread.NORM_PRIORITY+3);//注释这一行的话运行代码会发现t1和t2获取的运行时间很均匀，但是打开注释了的话你会发现明显在同时竞争cpu时候t1会占优势，当t1优先执行完毕

		t1.start();
		t2.start();
		
		System.out.println("补充：******");
		
		Main4Thread1  r=new Main4Thread1();
		
		Thread tt1=new Thread(r);
		Thread tt2=new Thread(r);
		
		//使用同一个线程对象启动两个线程是可以的
		tt1.start();
		tt2.start();
		

	}
}

class Main4Thread1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 0; i < 1000; i++) {
			System.out.println("Main4Thread1 " + i);
		}

	}

}

class Main4Thread2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 0; i < 1000; i++) {
			System.out.println("------------Main4Thread2 " + i);
		}
	}

}