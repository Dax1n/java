package com.daxin;

import java.util.Date;


/**
 * 
 * �߳�ѧϰ
 * 
 * 
 * �����̵߳�ֹͣ������Ҫʹ��interrupt��stop����
 * 
 * ʹ�ñ��λֹͣ
 * 
 * @author �ഺ��פDax1n
 *
 */
public class Main1 {
	public static void main(String[] args) throws Throwable {
		MyThread t=new MyThread();
		t.start();
		Thread.sleep(10000);//���߳�����
		
		
		//t.interrupt();//������̣߳�����һ�����߳��˳���������̫�ֱ��ˣ������̴߳�JDBC���ӵĻ���ֱ�ӹر�δ�ͷ�ռ����Դ��̫�ֱ�
		// t.stop();// stop��interrupt���ֱ�����Ϊinterrupt�������쳣�йر���Դ������stopһ���Ӵ���
		
		
		t.flag=false;//����ֹͣ�̱߳ȽϺ���

	}
}

/**
 * ʵ�ʽ���ʹ��ʵ�ֽӿڣ������ɿ��Ը���
 * 
 * 
 * @author �ഺ��פDax1n
 *
 */
class MyThread extends Thread {

	public boolean flag=true;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (flag) {
			//Thread.currentThread()��ȡ����ǰ���߳�
			System.out.println("Thread.currentThread().isAlive() : "+Thread.currentThread().isAlive());
			try {
				System.out.println(new Date());
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();//���̱߳����ʱ���׳�
				return ;//���쳣��ֹͣ����
			}

		}
	}

}
