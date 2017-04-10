package com.daxin.concurrent.collection;

import java.util.concurrent.CopyOnWriteArraySet;

/**
 * 
 * @author daxin
 * 
 * @email leodaxin@163com
 * 
 * @date 2017年4月10日 下午4:10:49
 * 
 */
public class CopyOnWriteArraySetMain {
	public static void main(String[] args) {

		CopyOnWriteArraySet<Integer> cset = new CopyOnWriteArraySet<>();

		Integer in = new Integer(1);
		cset.add(in);
		cset.add(2);
		cset.add(3);
		cset.add(4);
		cset.add(5);
		
		
		

		System.out.println(cset.size());

	}
}
