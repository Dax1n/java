package com.daxin.synchronization;

/**
 * 
 * @author �ഺ��פDax1n
 *
 */
public class TT implements Runnable {
	int b = 100;

	public synchronized void m1() throws Exception {//synchronizedֻ�ǶԴ�������
		
		System.out.println("m1 method ");
		// Thread.sleep(2000);
		b = 1000;//b�ĸ�ֵ���̵߳�˯��ʱ���˳��Խ��Ҳ��Ӱ���
		Thread.sleep(5000);//b�ĸ�ֵ���̵߳�˯��ʱ���˳��Խ��Ҳ��Ӱ���
		System.out.println("m1 b = " + b);
	}

	public synchronized void m2() throws Exception {//ȥ��synchronized�Ͳ�ȥ���Ա�
		System.out.println("m2 method ");//b�ĸ�ֵ���̵߳�˯��ʱ���˳��Խ��Ҳ��Ӱ���
		Thread.sleep(2500);//b�ĸ�ֵ���̵߳�˯��ʱ���˳��Խ��Ҳ��Ӱ���
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