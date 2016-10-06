package com.daxin.itcast;

/**
 * 创建线程方式1：继承Thread
 * 
 * 
 * 
 * @author 青春常驻Dax1n
 *
 */
public class MyThread  extends Thread{
	
	/**
	 * 用来模拟共享资源
	 */
	private String resource;//可以使用static修饰完成共享

	
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
	//main不一定在public class中
	public static void main(String[] args) {
		MyThread mt1=new MyThread();
		mt1.setResource("mt1 resource");
		MyThread mt2=new MyThread();
		mt2.setResource("mt2 resource");
		
		
		//NyThread的共享资源resource 是mt1和mt2每人一份，不利于线程共享
		//所以不建议使用继承方式创建线程
		mt1.start();
		mt2.start();
		
	}
} 
