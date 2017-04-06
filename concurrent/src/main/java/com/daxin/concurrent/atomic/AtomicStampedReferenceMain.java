package com.daxin.concurrent.atomic;

import java.util.concurrent.atomic.AtomicStampedReference;

import com.daxin.concurrent.atomic.fieldupdater.Count;

/**
 * AtomicStampedReference 维护带有整数“标志”的对象引用，可以用原子方式对其进行更新。
 * 
 * 类似于：AtomicMarkableReference
 * @author Daxin
 *
 */
public class AtomicStampedReferenceMain {
	public static void main(String[] args) {

		Count count = new Count();
		AtomicStampedReference<Count> as = new AtomicStampedReference<Count>(count, 1);

		System.out.println(as.getStamp());
		as.set(count, 2);

		System.out.println(as.getStamp());
		

	}

}
