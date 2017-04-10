package com.daxin.concurrent.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;

/**
 * 
 * @author daxin
 * 
 * @email leodaxin@163com
 * 
 * @date 2017年4月9日 下午2:44:14
 * 
 */
public class ConcurrentMapMain {
	public static void main(String[] args) throws InterruptedException {
		
		//复习：synchronizedMap实现是使用的代理模式实现的，SynchronizedMap是传入map的一个代理类，通过SynchronizedMap实例完成map的同步操作
		Map<String, String> smap = Collections.synchronizedMap(new HashMap<String, String>());
		smap.put("1", "1");//实现体内有一个对mutex的synchronized代码块
		
		System.out.println("--------------------------------------------------");

		
		ConcurrentMap<String, String> map =new ConcurrentHashMap<>();
		//put返回值是该key的上一次value，不存在的话返回null
		System.out.println(map.put("1", "1"));
		System.out.println(map.put("1", "2"));
		System.out.println(map.putIfAbsent("1", "3"));
 
		//lambda表达式写法
		map.forEach((x,y)->System.out.println(x+"   "+y));
		
		


	}

}
