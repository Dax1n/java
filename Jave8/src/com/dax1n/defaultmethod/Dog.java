package com.dax1n.defaultmethod;

public class Dog  implements Animal{
	

	/**
	 * 
	 * ��д�˸����public default void run() ����
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub.
		System.out.println("Dog is running ...");
	}
	
	
	public static void main(String[] args) {
		
		Dog dog=new Dog();
		dog.run();
		
	}

}
