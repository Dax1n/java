package com.daxin.concurrent.atomic.fieldupdater;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/*
 * 
 * AtomicIntegerFieldUpdater：原子更新整型的字段的更新器。
 *AtomicLongFieldUpdater：原子更新长整型字段的更新器。
 */
public class AtomicLongFieldUpdaterMain {

	public static void main(String[] args) {

		Count count = new Count();
		// Count中count类型为Integer会异常,而且必须是public类型
		AtomicIntegerFieldUpdater<Count> alfu = AtomicIntegerFieldUpdater.newUpdater(Count.class, "count");
		System.out.println(count.count);
		alfu.getAndAdd(count, 5);
		System.out.println(count.count);

		alfu.set(count, 20);
		System.out.println(count.count);

	}
}
