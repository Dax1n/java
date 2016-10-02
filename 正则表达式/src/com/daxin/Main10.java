package com.daxin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author 青春常驻Dax1n
 *
 *         qualifier的使用
 *
 *         qualifier修饰语
 */
public class Main10 {

	public static void main(String[] args) {

		// Greedy 贪婪的
		// Reluctant 不情愿的
		Greedy();
		Reluctant();
		Possessive();

	}
	
	public static void Greedy(){
		
		String data = "aaaa5bbbb4";

		String Reluctant = "(.{3,10})[0-9]";//贪婪似的，直接按范围的最大值吞进去，所以直接先吞进去10个看是否配？不匹配吐出来一个再看是否匹配
		Pattern p = Pattern.compile(Reluctant);
		Matcher m = p.matcher(data);

		if (m.find()) {
			System.out.println(m.start() + " - " + m.end());
		} else {
			System.out.println("not found ...");
		}
	}
	
	public static void Reluctant(){
		String data = "aaaa5bbbb4";

		String Reluctant = "(.{3,10}?)[0-9]";//不情愿的，直接吞进去最少的3个看是否匹配，不匹配然后在吞进去一个看看是否匹配？直接完成
		Pattern p = Pattern.compile(Reluctant);
		Matcher m = p.matcher(data);

		if (m.find()) {
			System.out.println(m.start() + " - " + m.end());
		} else {
			System.out.println("not found ...");
		}
	}
	
	
	/**
	 * Possessive:独占的意思
	 * 
	 * 也是直接最大的吞进去但是不吐，最后都没有了，所以匹配不上。最后找不到
	 * 
	 */
	public static void Possessive(){
		String data = "aaaa5bbbb4";//not found 
		String data1 = "aaaa5bbbb41";// 可以找到

		String Reluctant = "(.{3,10}+)[0-9]";//不情愿的，直接吞进去最少的3个看是否匹配，不匹配然后在吞进去一个看看是否匹配？直接完成
		Pattern p = Pattern.compile(Reluctant);
		Matcher m = p.matcher(data);

		if (m.find()) {
			System.out.println(m.start() + " - " + m.end());
		} else {
			System.out.println("not found ...");
		}
		
	}

}
