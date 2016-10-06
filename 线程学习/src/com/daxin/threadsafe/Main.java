package com.daxin.threadsafe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

/**
 * 线程安全的对象
 * 
 * 
 * @author 青春常驻Dax1n
 *
 */
public class Main {
	public static void main(String[] args) {

		//线程安全的
		StringBuffer sb=new StringBuffer();
		
		//线程安全的，一般考虑线程安全可以考虑Vector。但是一般我们及时考虑线程安全我也不选择一般选择是使用Collections的同步集合
		Vector<String> v=new Vector<String>();
		
		//线程安全的，  HashMap是线程不安全的
		Hashtable<String, String> ht=new Hashtable<String, String>();
		
		
		
		//可以使用Collections获取对应的线程安全对象
//		Collections.synchronizedList(list)
//		Collections.synchronizedMap(m)
//		Collections.synchronizedSet(s)
//		Collections.synchronizedSortedMap(m)
//		Collections.synchronizedSortedSet(s)
		
		
		//例如:list就是一个线程安全的list
		List<String>  list=Collections.synchronizedList(new ArrayList<String>());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
