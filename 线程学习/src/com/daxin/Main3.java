package com.daxin;

/**
 * 
 * 
 * 线程学习
 * 
 * Yield 方法 让出cpu一下
 * 
 * 
 * @author 青春常驻Dax1n
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
				//当前线程让出cpu，所以每当线程打印的数值是10的倍数时候一定切换线程打印，可以看出结果
				yield();
			}
			
		}

	}

}
