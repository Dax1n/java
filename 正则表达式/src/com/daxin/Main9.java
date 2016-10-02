package com.daxin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * ������ʽ�ķ���
 * 
 * 
 * @author Dax1n
 *
 */
public class Main9 {
	public static void main(String[] args) {

		Test1();
		System.out.println("---------�ָ���-----------");
		Test2();
	}

	/**
	 * ����Demo1
	 */
	public static void Test1() {
		String str = "123aa-456832bbc12-aa33";
		// ƥ�����ֳ���3-5��Ȼ����ĸ�������ε�������ʽ
		String rex = "\\d{3,5}[a-z]{2}";//�������������ʽΪһ��,�������Ϊ0

		Pattern p = Pattern.compile(rex);

		Matcher m = p.matcher(str);

		
		while (m.find()) {
			p("m.group() : "+m.group());
			p("m.group(0) : "+m.group(0));

		}
	}
	
	
	/**
	 * ����Demo2
	 * 
	 * С������Ϊ����
	 * 
	 * ����3-5�����ֺ�������ɵ��ַ�����ѡ����֮��ȡ���е����ֲ���
	 * 
	 */
	public static void Test2() {
		String str = "123aa-456832bbc12-aa33";
		// ƥ�����ֳ���3-5��Ȼ����ĸ�������ε�������ʽ
		
		
		//���ڼ���ļ��ɣ�����С����Ϊ�飬��һ��С�����ǵ�һ�飬�ڶ������ǵڶ���....
		String rex = "(\\d{3,5})([a-z]{2})";//�������������ʽΪһ��,�������Ϊ0

		Pattern p = Pattern.compile(rex);

		Matcher m = p.matcher(str);
		
		
		//����456832bbc12��ƥ���ƥ���������5����������ĸ
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
