package com.daxin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * ������ʽ
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
		
		//matches����һ��������ʽ,  ...��һ��ģʽ  ��.����һ���ַ�
		System.out.println(data.matches("..."));
		
		//    \\d����һ�����֣�������һ����б����ת���ַ�
		String new1=data.replaceAll("\\d", "_");
		
		System.out.println(new1);
		
		
		//Pattern  
		Pattern p1=  Pattern.compile("[a-z]");//[a-z]  ����һ������һ����ĸ��
		
		
		
		
 
		
		
		
		System.out.println("=====��������1��2������ͬ������ʵ���ϴ����2��Ч����Ϊ��������ʽ�����˱���=====");
		
		//�����1
		String s1="fgh";
		//�������ʱ����
		System.out.println("s1.matches(\"[a-z]{3}\") : "+s1.matches("[a-z]{3}"));
		
		//�����2
		//���ַ�ʽ������ʹ�ø����Pattern��Matcher����
		Pattern p2=  Pattern.compile("[a-z]{3}");//[a-z]  ����һ������3����ĸ��
	    Matcher m1 = p2.matcher(s1);
	    System.out.println("m1.matches() : "+m1.matches());
		
		
		 
		
		
		
		
	}

}
