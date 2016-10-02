package com.daxin;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main1 {

	public static void main(String[] args) {

		/**
		 * 
		 * HashMap允许使用null作为key或者value
		 * 
		 * HashMap是线程不同步
		 * 
		 */
		HashMap<Integer, Integer> mp = new HashMap<>();
		mp.put(null, 5);
		System.out.println(mp.get(null));

		/**
		 * 如果想要线程安全的HashMap，可以通过Collections类的静态方法synchronizedMap获得线程安全的HashMap
		 * 
		 */
		Map<Integer, Integer> hmp = Collections.synchronizedMap(new HashMap<Integer, Integer>());

		hmp.put(2, 2);

		int a = 4;
		System.out.println(a <<= 1);
		System.out.println(1 << 4);
		System.out.println(1 << 2);

	}

}
