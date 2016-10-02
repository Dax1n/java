package com.dax1n.defaultmethod;

public class Dog  implements Animal{
	

	/**
	 * 
	 * 重写了父类的public default void run() 方法
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
