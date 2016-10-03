package com.daxin.synchronization;

/**
 * 
 * synchronied ����
 * 
 * ֤��һ��ʵ������ֻ��һ����
 * 
 * 
 * @author �ഺ��פDax1n
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
					u1.m1();//���̵߳���m1��֮�����߳����ߣ����߳�u2����m2�����Դ�ӡ
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
