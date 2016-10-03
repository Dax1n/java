package com.daxin.synchronization;

/**
 * 
 * 
 * 有时间看看：http://blog.csdn.net/yanlinwang/article/details/44339113
 * 
 * 
 * @author 青春常驻Dax1n
 *
 */
public class Test {
	
	int b=100;
	
	public synchronized void m1() throws InterruptedException{
		
		b=1000;
		Thread.sleep(5000);
		
		System.out.println("m1 b = "+b);
	}

	public  void m2(){
		
		System.out.println("m2 b = "+b);
	}
	
	public static void main(String[] args) throws InterruptedException {
		Test t=new Test();
		t.m1();
		System.out.println("t.b ="+t.b);
		System.out.println("=================");
		Thread.sleep(1000);
		t.m2();
		System.out.println("t.b ="+t.b);
		
	}
	
}
