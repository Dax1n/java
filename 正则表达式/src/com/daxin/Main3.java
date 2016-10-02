package com.daxin;

/**
 * 
 * 
 * 正则表达式范围
 * 
 * @author Dax1n
 *
 */
public class Main3 {
	public static void main(String[] args) {
		
		//中括号表示有一个匹配上就行
		println("a".matches("[abc]"));

		
		
		//^取反的意思除了abc
		println("a".matches("[^abc]"));
		
		
		//a-z和A-Z的字符串
		println("a".matches("[a-zA-Z]"));
		
		//与上写法一直
		println("A".matches("[a-z]|[A-Z]"));
		
		//A-Z&&[RFG]  是A-Z中并且是RFG中的一个（交集）
		println("R".matches("[A-Z&&[RFG]]"));
		
		
		
		
		
	}

	public static void println(Object obj) {

		System.out.println(obj);
	}
}
