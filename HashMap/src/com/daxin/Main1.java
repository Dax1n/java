package com.daxin;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main1 {

	public static void main(String[] args) {

		/**
		 * 
		 * HashMap����ʹ��null��Ϊkey����value
		 * 
		 * HashMap���̲߳�ͬ��
		 * 
		 */
		HashMap<Integer, Integer> mp = new HashMap<>();
		mp.put(null, 5);
		System.out.println(mp.get(null));

		/**
		 * �����Ҫ�̰߳�ȫ��HashMap������ͨ��Collections��ľ�̬����synchronizedMap����̰߳�ȫ��HashMap
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
