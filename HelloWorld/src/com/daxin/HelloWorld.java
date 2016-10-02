package com.daxin;

public interface HelloWorld {

	public void sayHello();

	/**
	 * 新特性1.8
	 */
	public static void say() {

	}

	/**
	 * 新特性1.8
	 */
	public default void sayHaha() {

	}

}
