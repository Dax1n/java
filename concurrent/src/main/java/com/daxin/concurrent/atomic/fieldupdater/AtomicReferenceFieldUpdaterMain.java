package com.daxin.concurrent.atomic.fieldupdater;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/**
 * 这是一个引用类型的原子字段更新器
 * @author Daxin
 *
 */
public class AtomicReferenceFieldUpdaterMain {
	public static void main(String[] args) {
		
		AtomicReferenceFieldUpdater<ReferenceCount, Integer> ar =AtomicReferenceFieldUpdater.newUpdater(ReferenceCount.class, Integer.class, "count");
		ReferenceCount rc=new ReferenceCount();
		System.out.println(rc.count);
		ar.set(rc, 5);
		System.out.println(rc.count);
		
		
		
	}

}
