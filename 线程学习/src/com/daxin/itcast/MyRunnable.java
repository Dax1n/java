package com.daxin.itcast;

/**
 * 
 * 创建线程方式2
 * 
 * @author 青春常驻Dax1n
 *
 */
public class MyRunnable  implements Runnable{

	/**
	 * 用来模拟共享资源
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
		//resouce资源线程1和2是共享的
		t1.start();
		t2.start();
		
		
		
	}
}













