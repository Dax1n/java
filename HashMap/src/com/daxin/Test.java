package com.daxin;

import java.util.HashMap;

public class Test {
	public static void main(String[] args) {
		
		HashMap<Integer, Integer> m1=new HashMap<>(300000001);
		HashMap<Integer, Integer> m2=new HashMap<>();
		
		long startm1=System.currentTimeMillis();
		for(int i=0;i<300000001;i++){
			m1.put(i, i);
			
		}	
		long endm1=System.currentTimeMillis();
		System.out.println(endm1-startm1);
		
		
		
		
		long startm2=System.currentTimeMillis();
		for(int i=0;i<300000001;i++){
			m2.put(i, i);
			
		}	
		long endm2=System.currentTimeMillis();
		System.out.println(endm2-startm2);
	}

}
