package com.daxin;

import java.util.Date;

/**
 * 
 * �߳�ѧϰ֮Join����
 * 
 * 
 * @author �ഺ��פDax1n
 *
 */
public class Main2 {

	public static void main(String[] args) {
		Main2Thread mt = new Main2Thread("dax1n");
		mt.start();// ��ʱ���̺߳����߳�ͬʱ����

		try {
			mt.join();// ���̼߳��뵽���߳��ˣ��൱��һ���߳��ˡ���ʱֻ�����߳�ִ�����֮�����̲߳ſ�ʼִ��
			//�������ս���� ���̴߳�ӡ���֮�����߳̿�ʼ��ӡ

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