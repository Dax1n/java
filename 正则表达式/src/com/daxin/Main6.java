package com.daxin;

public class Main6 {
	
	public static void main(String[] args) {
		
		//开头的字符是空白的不是换行符而且有多个空格并且最后一个字符是回车符
		System.out.println("  \n".matches("^[\\s&&[^\\n]]*\\n$"));
		
		
		p("匹配邮箱的正则表达式");
		
		//  \\w构成代词的字符
		String reg="[a-zA-Z0-9_]*@[a-z0-9]*\\.com";
		
		p("asd_5sad@qq.com".matches(reg));
		p("asd_5sad@163.com".matches(reg));
		p("asd_5sad@neusoft.com".matches(reg));
		
		 
		
		
		
	}
	public static void p(Object obj) {

		System.out.println(obj);
	}
}
