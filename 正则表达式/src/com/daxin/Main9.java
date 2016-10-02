package com.daxin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * 正则表达式的分组
 * 
 * 
 * @author Dax1n
 *
 */
public class Main9 {
	public static void main(String[] args) {

		Test1();
		System.out.println("---------分隔符-----------");
		Test2();
	}

	/**
	 * 分组Demo1
	 */
	public static void Test1() {
		String str = "123aa-456832bbc12-aa33";
		// 匹配数字出现3-5次然后字母出现两次的正则表达式
		String rex = "\\d{3,5}[a-z]{2}";//这里面整个表达式为一组,组的索引为0

		Pattern p = Pattern.compile(rex);

		Matcher m = p.matcher(str);

		
		while (m.find()) {
			p("m.group() : "+m.group());
			p("m.group(0) : "+m.group(0));

		}
	}
	
	
	/**
	 * 分组Demo2
	 * 
	 * 小括号作为分组
	 * 
	 * 需求：3-5个数字和两个组成的字符串挑选出来之后，取其中的数字部分
	 * 
	 */
	public static void Test2() {
		String str = "123aa-456832bbc12-aa33";
		// 匹配数字出现3-5次然后字母出现两次的正则表达式
		
		
		//数第几组的技巧：以左小括号为组，第一个小阔就是第一组，第二个就是第二组....
		String rex = "(\\d{3,5})([a-z]{2})";//这里面整个表达式为一组,组的索引为0

		Pattern p = Pattern.compile(rex);

		Matcher m = p.matcher(str);
		
		
		//对于456832bbc12的匹配会匹配最长的数字5个和两个字母
		while(m.find()){
			
			p("m.group(): "+m.group());
			p("m.group(0): "+m.group(0));
			p("m.group(1): "+m.group(1));
			p("m.group(2): "+m.group(2));
		}

	}

	

	public static void p(Object obj) {

		System.out.println(obj);
	}
}
