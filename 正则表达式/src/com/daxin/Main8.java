package com.daxin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 字符串的替换
 * 
 * 
 * @author Dax1n
 *
 */
public class Main8 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("java", Pattern.CASE_INSENSITIVE);// 大小写不敏感，就是忽略大小写
		Matcher m = p.matcher("java Java JaVA IlovejAVA sdfsdf");
		// m匹配之后调用Matcher的方法会替换掉匹配的所有内容

		// 需求1：找到的java转换为大写JAVA
		p(m.replaceAll("JAVA"));
		// 需求2：找到的奇数java变为小写，偶数的java变为大写
		m.reset();// 重置
		int i = 1;
		StringBuffer sb=new StringBuffer();
		while (m.find()) {
//			appendReplacement实现莫非就是重新拼接一个字符串而已
			if (i % 2 == 0) {
				// 奇数
				m.appendReplacement(sb, "java");//使用后面的替换当前匹配的字符串，然后存到sb中

			} else {
				// 偶数
				m.appendReplacement(sb, "JAVA");//使用后面的替换当前匹配的字符串，然后存到sb中


			}
			i++;

		}
		
		
		p("发现尾巴不见了，就是后面未匹配的那一部分不见了");
		
		p("sb: "+sb);
		
		p("添加尾巴到字符串中");
		m.appendTail(sb);
		p("sb: "+sb);
		m.reset();
		while (m.find()) {
			p(m.group());//
		}

	}

	public static void p(Object obj) {

		System.out.println(obj);
	}
}
