package com.daxin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NoneCapture {

	// 非捕获

	public static void main(String[] args) {

		Pattern p1 = Pattern.compile("(?=a).{3}");// (?=a)写在前面是捕获

		Pattern p = Pattern.compile(".{3}(?=a)");
		String s = "abca456";// 三个字符而且三个字符后面是一个a。这样的字符提取出来，但是不把最后一个a提出出来

		Matcher m = p.matcher(s);

		if (m.find()) {
			System.out.println(m.group());
		} else {
			System.out.println("not found...");
		}

		System.out.println(" 向前引用 :");

		backRefenrence();

	}

	/**
	 * 向前引用
	 * 
	 */
	public static void backRefenrence() {

		// 组代表：(\\d\\d) 两个数字， \\1表示后面的和前面的两个数字相同的匹配出来
		//后面的数字1表示向前引用和第几组的相同，1就表示和第一组相同
		Pattern p = Pattern.compile("(\\d\\d)\\1");

		String s = "1212";// 12后面还是12和前面两个数字12匹配，所以成功
		Matcher m = p.matcher(s);

		System.out.println(m.matches());

	}

}
