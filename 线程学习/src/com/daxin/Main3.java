package com.daxin;

/**
 * 
 * 
 * �߳�ѧϰ
 * 
 * Yield ���� �ó�cpuһ��
 * 
 * 
 * @author �ഺ��פDax1n
 *
 */
public class Main3 {
	public static void main(String[] args) {
		Main3Thread t1=new Main3Thread("t1");
		Main3Thread t2=new Main3Thread("t2");
		
		
		t1.start();
		t2.start();
		
		
	}

}



class Main3Thread extends Thread {

	public Main3Thread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {

			System.out.println("i am " + this.getName() + "  " + i);
			
			if(i%10==0){
				//��ǰ�߳��ó�cpu������ÿ���̴߳�ӡ����ֵ��10�ı���ʱ��һ���л��̴߳�ӡ�����Կ������
				yield();
			}
			
		}

	}

}
