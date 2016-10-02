package com.dax1n.defaultmethod;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * 
 * Java8 因特性探索
 * 
 * @author Dax1n
 *
 */
public interface Animal {
	
 
	/**
	 * 
	 * ava8发布，即在不破坏Java现有实现架构的情况下能往接口里增加新方法。引入Default方法到Java8 <br>
	 * default方法： 
	 * 一般也叫：虚拟扩展方法
	 * 
	 */
	public default void run() {

		System.out.println("Animal is running...");

	}

	/**
	 * 接口中可以有main方法
	 *
	 * 虚拟扩展方法（Virtual extension methods），通常也称之为 defender 方法
	 *
	 * Java接口现在可以有非抽象方法了。Default 方法带来的好处是，往接口新增一个Default 方法，而不破坏现有的实现架构。
	 *
	 * 尽管如此，Default 方法不适合过多使用，但是对于Java集合API的优化升级，并达到无缝地结合Lambda表达式来说，Default
	 * 方法是至关重要的特性。
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("如此神奇，接口中可以有main方法...");

		ArrayList<Integer> data = new ArrayList<>();
		data.add(1);
		data.add(2);
		data.add(3);
		data.add(4);
		data.forEach(System.out::println);// Lambda code goes here

	}

}
