package com.daxin.synchronization;

/**
 * 
 * synchronied 方法
 * 
 * 证明一个实例对象只有一把锁
 * 
 * 
 * @author 青春常驻Dax1n
 *
 */
public class User {

	public String name;

	public User(String name) {

		this.name = name;
	}

	public static void main(String[] args) throws Throwable {
		// synchronized
		final User u1 = new User("Jack");
		User u2 = new User("Mali");
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					u1.m1();//子线程调用m1，之后子线程休眠，主线程u2调用m2，可以打印
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();

		u2.m2();

	}

	public synchronized void m1() throws InterruptedException {
		System.out.println(name + " m1 ...");
		Thread.sleep(5000);
	}

	public synchronized void m2() {
		System.out.println(name + " m2 ...");

	}

}
