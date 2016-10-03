package com.daxin.synchronization;

/**
 * 
 * @author 青春常驻Dax1n
 *
 */
public class TT implements Runnable {
	int b = 100;

	public synchronized void m1() throws Exception {//synchronized只是对代码块加锁
		
		System.out.println("m1 method ");
		// Thread.sleep(2000);
		b = 1000;//b的赋值和线程的睡眠时间的顺序对结果也有影响的
		Thread.sleep(5000);//b的赋值和线程的睡眠时间的顺序对结果也有影响的
		System.out.println("m1 b = " + b);
	}

	public synchronized void m2() throws Exception {//去掉synchronized和不去掉对比
		System.out.println("m2 method ");//b的赋值和线程的睡眠时间的顺序对结果也有影响的
		Thread.sleep(2500);//b的赋值和线程的睡眠时间的顺序对结果也有影响的
		b = 2000;
	}

	public void run() {
		try {
			m1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		TT tt = new TT();
		Thread t = new Thread(tt);
		t.start();
	 
		tt.m2();
		System.out.println("tt.b ="+tt.b);
	}
}