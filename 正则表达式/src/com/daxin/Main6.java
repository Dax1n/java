package com.daxin;

public class Main6 {
	
	public static void main(String[] args) {
		
		//��ͷ���ַ��ǿհ׵Ĳ��ǻ��з������ж���ո������һ���ַ��ǻس���
		System.out.println("  \n".matches("^[\\s&&[^\\n]]*\\n$"));
		
		
		p("ƥ�������������ʽ");
		
		//  \\w���ɴ��ʵ��ַ�
		String reg="[a-zA-Z0-9_]*@[a-z0-9]*\\.com";
		
		p("asd_5sad@qq.com".matches(reg));
		p("asd_5sad@163.com".matches(reg));
		p("asd_5sad@neusoft.com".matches(reg));
		
		 
		
		
		
	}
	public static void p(Object obj) {

		System.out.println(obj);
	}
}
