package com.daxin.producer.consumer;
/**
 * 
 * @author �ഺ��פDax1n
 *
 */
public class Consumer implements Runnable{

	private StackBox sb;
	
	
	public Consumer(StackBox sb) {
		super();
		this.sb = sb;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
	for(int i=1;i<=20;i++){
			System.out.println("--------> ����"+sb.pop());
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
