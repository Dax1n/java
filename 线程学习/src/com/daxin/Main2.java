package com.daxin;

import java.util.Date;

/**
 * 
 * 线程学习之Join方法
 * 
 * 
 * @author 青春常驻Dax1n
 *
 */
public class Main2 {

	public static void main(String[] args) {
		Main2Thread mt = new Main2Thread("dax1n");
		mt.start();// 此时主线程和子线程同时存在

		try {
			mt.join();// 子线程加入到主线程了，相当于一个线程了。此时只有子线程执行完毕之后主线程才开始执行
			//所以最终结果是 子线程打印完毕之后主线程开始打印

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < 20; i++) {

			System.out.println("I am main thread...");
		}

	}

}

class Main2Thread extends Thread {

	public Main2Thread(String flag) {
		super(flag);
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {

			System.out.println("i am " + this.getName() + "  " + i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return;
			}
		}

	}

}