package com.daxin;

import java.util.Date;


/**
 * 
 * 线程学习
 * 
 * 
 * 对于线程的停止尽量不要使用interrupt和stop方法
 * 
 * 使用标记位停止
 * 
 * @author 青春常驻Dax1n
 *
 */
public class Main1 {
	public static void main(String[] args) throws Throwable {
		MyThread t=new MyThread();
		t.start();
		Thread.sleep(10000);//主线程休眠
		
		
		//t.interrupt();//打断子线程，这是一种让线程退出来。但是太粗暴了，例如线程打开JDBC连接的话，直接关闭未释放占用资源。太粗暴
		// t.stop();// stop比interrupt还粗暴，因为interrupt可以在异常中关闭资源，但是stop一棒子打死
		
		
		t.flag=false;//这样停止线程比较合理

	}
}

/**
 * 实际建议使用实现接口，这样可控性更高
 * 
 * 
 * @author 青春常驻Dax1n
 *
 */
class MyThread extends Thread {

	public boolean flag=true;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (flag) {
			//Thread.currentThread()获取到当前的线程
			System.out.println("Thread.currentThread().isAlive() : "+Thread.currentThread().isAlive());
			try {
				System.out.println(new Date());
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();//当线程被打断时候抛出
				return ;//抛异常了停止运行
			}

		}
	}

}
