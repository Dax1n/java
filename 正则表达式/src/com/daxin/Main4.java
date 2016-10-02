package com.daxin;

/**
 * 
 * 实际写代码需要些\\ 代表转义
 * 
 * \d 代表一个数字
 * 
 * 
 * \D 代表非数字 [^0-9]
 * 
 * 
 * \s 代表一个空格
 * 
 * \S 代表一个非空格 [^\s]
 * 
 * ^号在括号外面的话有特殊使用
 * 
 * 
 * \w 代表一个单词字符（不是一个单词）[a-zA-Z_0-9]
 * 
 * 
 * @author Dax1n
 *
 */
public class Main4 {

	public static void main(String[] args) {
		println(" ".matches("\\s"));

		println("\\w与[a-zA-Z_0-9]等效");
		println("_".matches("\\w"));

		// println("\\".matches("\\"));//这一行代码异常

		// 在java中 的"\"会被java认为是 一个" 和\"
		// 就是斜线是单个双引号的转移字符，导致双引号的左部的单个双引号找不到右边的匹配双引号，因此报错
		println("\\".matches("\\\\"));//"\\"表示一个斜线。正则表达式匹配"\\"需要\\\\

	}

	public static void println(Object obj) {

		System.out.println(obj);
	}
}
