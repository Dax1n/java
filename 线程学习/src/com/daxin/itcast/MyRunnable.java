package com.daxin.itcast;

/**
 * 
 * �����̷߳�ʽ2
 * 
 * @author �ഺ��פDax1n
 *
 */
public class MyRunnable  implements Runnable{

	/**
	 * ����ģ�⹲����Դ
	 */
	private String resource;

	
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
			System.out.println(Thread.currentThread().getName());
			System.out.println(i);
		} 
		
	}

}

class Test1{
	public static void main(String[] args) {
		
		MyRunnable mr1=new MyRunnable();
		
		Thread t1=new Thread(mr1);
		Thread t2=new Thread(mr1);
		//resouce��Դ�߳�1��2�ǹ����
		t1.start();
		t2.start();
		
		
		
	}
}













