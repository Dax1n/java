package com.daxin.synchronization;

/**
 * 
 * 
 * ���� �������������� ���������Է���Ҫ����Դ
 * 
 * �������������⣺ ��ѧ�ҾͲ�����
 * 
 * 
 * @author �ഺ��פDax1n
 *
 */
public class DeadLock implements Runnable {

	public int flag = 1;

	Object o1 = new Object(), o2 = new Object();

	public static void main(String[] args) throws Throwable {

		DeadLock dl = new DeadLock();

		Thread t1 = new Thread(dl);
		Thread t2 = new Thread(dl);

		t1.start();// ����start������һ����һ��ִ��run�д��룬�����Ҫ������ϵͳ�Ƿ������ʱ��Ƭ
		Thread.sleep(1000);// ������仰�����������ĸ��ʣ����������仰�Ŀ��ܳ���һ��ʱ��Ƭ��t1֮��t1ֱ������o1֮������o2�������Ȼ��t2ҳ���������û�г�������
		dl.flag = 0;
		t2.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		System.out.println("flag= " + flag);
		if (flag == 0) {

			// ����취֮һ���Ӵ���������,�������д���ֱ�Ӱ�o1��o2һ������
			synchronized (o1) {
				try {
					System.out.println("��һ��if���������o1");

					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				synchronized (o2) {
					System.out.println("o1 - o2  �������");
				}

			}

		}

		if (flag == 1) {

			synchronized (o2) {
				System.out.println("�ڶ���if���������o2");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				synchronized (o1) {
					System.out.println("o2 - o1 �������");
				}

			}

		}

	}

}
