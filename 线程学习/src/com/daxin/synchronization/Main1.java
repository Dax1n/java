package com.daxin.synchronization;

/**
 * 
 * �߳�ͬ������
 *
 * ����1
 * 
 * @author �ഺ��פDax1n
 * 
 * 
 * 
 *
 */
public class Main1 implements Runnable {
	Timer timer = new Timer();

	public static void main(String[] args) {

		Main1 m = new Main1();// ����һ��Main1��ʵ��������һ��timer������

		Thread t1 = new Thread(m);// �߳�1���߳�2��ͬռ����Դtimer
		Thread t2 = new Thread(m);//�߳�1���߳�2��ͬռ����Դtimer

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

// �����߳�ͬ�������ˣ�
// t2 , ���ǵ�2��ʹ��
// t1 , ���ǵ�2��ʹ��

class Timer {

	private static int num = 0;

	public void add(String name) {
		
	 //����ͬ�������Ϳ��Խ��������
			num++;//num++δ���������³���
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name + " , " + "���ǵ�" + num + "��ʹ��");
	 

	

	}

}