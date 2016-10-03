package com.daxin.producer.consumer;
/**
 * 
 * @author Çà´º³£×¤Dax1n
 *
 */
public class Main {
	public static void main(String[] args) {
		
		StackBoxV2 sb2=new StackBoxV2();
		Producer p=new Producer(sb2);
		Consumer c=new Consumer(sb2);
		new Thread(p).start();
		new Thread(c).start();

	}
}
