package com.daxin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {

	public static void main(String[] args) {

		String s1 = "ABC";
		// 匹配A-Z的三个字母的字符串
		Pattern p = Pattern.compile("[A-Z]{3}");
		Matcher m1 = p.matcher(s1);
		System.out.println(m1.matches());

		System.out.println("初步认识. * +");
		
		println("a".matches("."));
		
		//正则表达式也可以是一个字符串，例如abc ，匹配字符串是abc的
		println("abc".matches("abc"));
		
		
		//X*是代表X出现0次或者多次的字符串，（aaabaaa是匹配不成功）
		println("aaaaa".matches("a*"));
		
		//X*是代表X出现1次或者多次的字符串，（aaabaaa是匹配不成功）
		println("aaaaa".matches("a+"));
		
		
		//a?是匹配0个或者一个
		println("aaaaa".matches("a?"));
		println("a".matches("a?"));
		
		
		//匹配5出现3到20次的字符串
		println("5555555".matches("5{3,20}"));
		
		//数字出现3-20次的字符串
		println("58565".matches("\\d{3,20}"));
		
		
		
		println("匹配IP地址的正则表达式：");
		
		String IP="192.168.1.1";
		println(IP.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}"));
		
		println("显然下面这个IP地址是错误的...");
		String IP2="292.268.1.1";
		println(IP2.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}"));
		
		
		
		
		println("IP地址单个数字界限限定");
		
		
		println("192".matches("[0-2][0-9][0-9]"));//这个和字母的a-z是类似
		
		println("不严谨正确的IP地址匹配方法：");
		println(IP2.matches("[0-2][0-9][0-9]\\.[0-2][0-9][0-9]\\.[0-2][0-9][0-9]\\.[0-2][0-9][0-9]"));
		
		String IP3="292.192.168.168";
		//292 
		println(IP3.matches("[0-2][0-9][0-9]\\.[0-2][0-9][0-9]\\.[0-2][0-9][0-9]\\.[0-2][0-9][0-9]"));
		
	
		
		println("匹配数字为0-5的数字，出现次数为5到50次的");
		println("12304213025".matches("[0-5]{5,50}"));
		
		

	}

	public static void println(Object obj) {

		System.out.println(obj);
	}

}
