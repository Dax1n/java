package com.daxin.concurrent.atomic;

import java.util.concurrent.atomic.AtomicMarkableReference;

import com.daxin.concurrent.atomic.fieldupdater.Count;


/**
 * 原子更新带有标记位的引用类型。可以原子的更新一个布尔类型的标记位和引用类型。
 * 构造方法是AtomicMarkableReference(V initialRef, boolean initialMark)
 * 
 * @author Daxin
 * 
 * 其实就是一个引用类型和一个boolean的键值对关系
 * 
 * 
 * 实现原理：CAS
 * 
 *
 */
public class AtomicMarkableReferenceMain {
	public static void main(String[] args) {
		Count count1 =new Count();
		count1.count=1;
		Count count2 =new Count();
		count2.count=2;
		Count count3 =new Count();
		count3.count=3;
		
		AtomicMarkableReference<Count> am=new AtomicMarkableReference<Count>(count1, false);
		
		am.set(count1, true);
		am.set(count2, true); //设置am的key和value
		am.set(count3, false);
		
		
		
		boolean []b = new boolean[1];
		Count count =am.get(b);
		System.out.println(count.count);
		
	}

}
