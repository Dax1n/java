package com.daxin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * 正则表达式
 * 
 * @author Dax1n
 * 
 * Pattern 
 * 
 * 
 *
 */
public class Main1 {
	
	public static void main(String[] args) {
		
		String data="abc65sdsd";
		
		//matches接受一个正则表达式,  ...是一种模式  。.代表一个字符
		System.out.println(data.matches("..."));
		
		//    \\d代表一个数字，其中有一个反斜线是转义字符
		String new1=data.replaceAll("\\d", "_");
		
		System.out.println(new1);
		
		
		//Pattern  
		Pattern p1=  Pattern.compile("[a-z]");//[a-z]  配置一个具有一个字母的
		
		
		
		
 
		
		
		
		System.out.println("=====下面代码块1和2功能相同，但是实际上代码块2高效，因为对正则表达式进行了编译=====");
		
		//代码块1
		String s1="fgh";
		//这个是临时编译
		System.out.println("s1.matches(\"[a-z]{3}\") : "+s1.matches("[a-z]{3}"));
		
		//代码块2
		//这种方式还可以使用更多的Pattern和Matcher方法
		Pattern p2=  Pattern.compile("[a-z]{3}");//[a-z]  配置一个具有3个字母的
	    Matcher m1 = p2.matcher(s1);
	    System.out.println("m1.matches() : "+m1.matches());
		
		
		 
		
		
		
		
	}

}
