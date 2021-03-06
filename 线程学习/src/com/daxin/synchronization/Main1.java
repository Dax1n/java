package com.daxin.synchronization;

/**
 * 
 * 线程同步问题
 *
 * 问题1
 * 
 * @author 青春常驻Dax1n
 * 
 * 
 * 
 *
 */
public class Main1 implements Runnable {
	Timer timer = new Timer();

	public static void main(String[] args) {

		Main1 m = new Main1();// 创建一个Main1分实例，持有一个timer的引用

		Thread t1 = new Thread(m);// 线程1和线程2共同占用资源timer
		Thread t2 = new Thread(m);//线程1和线程2共同占用资源timer

		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		timer.add(Thread.currentThread().getName());

	}
}

// 出现线程同步问题了：
// t2 , 你是第2个使用
// t1 , 你是第2个使用

class Timer {

	private static int num = 0;

	public void add(String name) {
		
	 //加上同步代码块就可以解决此问题
			num++;//num++未上锁，导致出错
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name + " , " + "你是第" + num + "个使用");
	 

	

	}

}