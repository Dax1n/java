package com.daxin.producer.consumer;
/**
 * 
 * @author �ഺ��פDax1n
 *
 */
public class Producer implements Runnable{
	
	private StackBox sb;
	

	public Producer(StackBox sb) {
		super();
		this.sb = sb;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=20;i++){
			
			Bread bread=new Bread(i);
		
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sb.push(bread);
			System.out.println("����"+bread);
			
		}
		
	}

}
