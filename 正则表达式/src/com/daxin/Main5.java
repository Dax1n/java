package com.daxin;

/**
 * 
 * 边界匹配
 * 
 * @author Dax1n
 *
 */
public class Main5 {

	public static void main(String[] args) {
		
		//^在括号外面使用的话代表字符的开始，这个转移字符表示开始字符是H的，后面有0个或者多个的字符
		 p("Hello Sir".matches("^H.*"));
		 
		 
		 
		 //$表示以什么结尾的字符
		 p("Hello Sir".matches(".*ir$"));
		 
		 
//		  //b表示单词边界
		 p("Hello Sir".matches("^H[a-z]{3}o\\b.*"));
		 p("HelloSir".matches("^H[a-z]{3}o\\b.*"));
		
		
	}
	public static void p(Object obj) {

		System.out.println(obj);
	}
}
