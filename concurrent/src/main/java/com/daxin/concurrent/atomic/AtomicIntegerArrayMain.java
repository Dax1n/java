package com.daxin.concurrent.atomic;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * CAS和volatile保证
 * @author Daxin
 *
 */
public class AtomicIntegerArrayMain {
	public static void main(String[] args) {
		
		AtomicIntegerArray aia=new AtomicIntegerArray(5);
		
		aia.set(2, 2);
		
	}

}
