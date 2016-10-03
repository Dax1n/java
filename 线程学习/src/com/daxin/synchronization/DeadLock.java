package com.daxin.synchronization;

/**
 * 
 * 
 * 死锁 死锁产生条件： 互相锁定对方需要的资源
 * 
 * 著名的死锁问题： 哲学家就餐问题
 * 
 * 
 * @author 青春常驻Dax1n
 *
 */
public class DeadLock implements Runnable {

	public int flag = 1;

	Object o1 = new Object(), o2 = new Object();

	public static void main(String[] args) throws Throwable {

		DeadLock dl = new DeadLock();

		Thread t1 = new Thread(dl);
		Thread t2 = new Thread(dl);

		t1.start();// 调用start方法不一定会一定执行run中代码，这个需要看操作系统是否分配了时间片
		Thread.sleep(1000);// 加上这句话可以扩大错误的概率，如果不加这句话的可能出现一个时间片给t1之后t1直接锁定o1之后锁定o2完成任务，然后t2页完成任务导致没有出现死锁
		dl.flag = 0;
		t2.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		System.out.println("flag= " + flag);
		if (flag == 0) {

			// 解决办法之一：加大锁的粒度,下面这行代码直接把o1和o2一起锁上
			synchronized (o1) {
				try {
					System.out.println("第一个if语句锁上了o1");

					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				synchronized (o2) {
					System.out.println("o1 - o2  完成任务！");
				}

			}

		}

		if (flag == 1) {

			synchronized (o2) {
				System.out.println("第二个if语句锁上了o2");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				synchronized (o1) {
					System.out.println("o2 - o1 完成任务！");
				}

			}

		}

	}

}
