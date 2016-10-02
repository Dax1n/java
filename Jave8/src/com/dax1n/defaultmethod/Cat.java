package com.dax1n.defaultmethod;

/**
 * 
 * @author Dax1n
 *
 */
public class Cat implements Animal {

	/**
	 * 没有重写了父类的public default void run() 方法
	 */

	public static void main(String[] args) {

		Dog dog = new Dog();
		// 没有重写了父类的public default void run() 方法,调用run方法时候调用的是父类的run
		dog.run();

	}

}