package com.daxin;

/**
 * �̵߳����ȼ�
 * 
 * Ĭ�ϵ������ȼ�����ֵ��5
 * 
 * 
 * @author �ഺ��פDax1n
 *
 */
public class Main4 {
	public static void main(String[] args) {

		Thread t1 = new Thread(new Main4Thread1());
		Thread t2 = new Thread(new Main4Thread2());

		// t1.setPriority(Thread.NORM_PRIORITY+3);//ע����һ�еĻ����д���ᷢ��t1��t2��ȡ������ʱ��ܾ��ȣ����Ǵ�ע���˵Ļ���ᷢ��������ͬʱ����cpuʱ��t1��ռ���ƣ���t1����ִ�����

		t1.start();
		t2.start();
		
		System.out.println("���䣺******");
		
		Main4Thread1  r=new Main4Thread1();
		
		Thread tt1=new Thread(r);
		Thread tt2=new Thread(r);
		
		//ʹ��ͬһ���̶߳������������߳��ǿ��Ե�
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