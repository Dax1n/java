package com.daxin.itcast;

/**
 * 
 * ����ǿ����ǲ��͵�java�γ̵Ĵ���
 * 
 * @author �ഺ��פDax1n
 *
 */
public class Main1 {
	
	public static void main(String[] args) {
		
		//���̵߳�������main���ڷ��̶߳����л�ȡ��ǰ�߳�����ʹ��Thread.currentThread()
		System.out.println(Thread.currentThread().getName());
		//�����޸����߳�����
		Thread.currentThread().setName("dax1n");
		//�̵߳�getName��setName����Thread��ʵ�ֵģ�������Runnable��ʹ�ò���getName
		//ֻ��ʹ��Thread.currentThread().getName()
		System.out.println(Thread.currentThread().getName());
		
	}

}
