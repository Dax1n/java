package com.dax1n.defaultmethod;

/**
 * 
 * @author Dax1n
 *
 */
public class Cat implements Animal {

	/**
	 * û����д�˸����public default void run() ����
	 */

	public static void main(String[] args) {

		Dog dog = new Dog();
		// û����д�˸����public default void run() ����,����run����ʱ����õ��Ǹ����run
		dog.run();

	}

}