package com.daxin.itcast;

/**
 * �����̷߳�ʽ1���̳�Thread
 * 
 * 
 * 
 * @author �ഺ��פDax1n
 *
 */
public class MyThread  extends Thread{
	
	/**
	 * ����ģ�⹲����Դ
	 */
	private String resource;//����ʹ��static������ɹ���

	
	public String getResource() {
		return resource;
	}


	public void setResource(String resource) {
		this.resource = resource;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<50;i++){
			System.out.println(i);
		} 
		
	}
	
	
}

class  Test{
	//main��һ����public class��
	public static void main(String[] args) {
		MyThread mt1=new MyThread();
		mt1.setResource("mt1 resource");
		MyThread mt2=new MyThread();
		mt2.setResource("mt2 resource");
		
		
		//NyThread�Ĺ�����Դresource ��mt1��mt2ÿ��һ�ݣ��������̹߳���
		//���Բ�����ʹ�ü̳з�ʽ�����߳�
		mt1.start();
		mt2.start();
		
	}
} 
