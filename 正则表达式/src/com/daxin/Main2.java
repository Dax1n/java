package com.daxin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {

	public static void main(String[] args) {

		String s1 = "ABC";
		// ƥ��A-Z��������ĸ���ַ���
		Pattern p = Pattern.compile("[A-Z]{3}");
		Matcher m1 = p.matcher(s1);
		System.out.println(m1.matches());

		System.out.println("������ʶ. * +");
		
		println("a".matches("."));
		
		//������ʽҲ������һ���ַ���������abc ��ƥ���ַ�����abc��
		println("abc".matches("abc"));
		
		
		//X*�Ǵ���X����0�λ��߶�ε��ַ�������aaabaaa��ƥ�䲻�ɹ���
		println("aaaaa".matches("a*"));
		
		//X*�Ǵ���X����1�λ��߶�ε��ַ�������aaabaaa��ƥ�䲻�ɹ���
		println("aaaaa".matches("a+"));
		
		
		//a?��ƥ��0������һ��
		println("aaaaa".matches("a?"));
		println("a".matches("a?"));
		
		
		//ƥ��5����3��20�ε��ַ���
		println("5555555".matches("5{3,20}"));
		
		//���ֳ���3-20�ε��ַ���
		println("58565".matches("\\d{3,20}"));
		
		
		
		println("ƥ��IP��ַ��������ʽ��");
		
		String IP="192.168.1.1";
		println(IP.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}"));
		
		println("��Ȼ�������IP��ַ�Ǵ����...");
		String IP2="292.268.1.1";
		println(IP2.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}"));
		
		
		
		
		println("IP��ַ�������ֽ����޶�");
		
		
		println("192".matches("[0-2][0-9][0-9]"));//�������ĸ��a-z������
		
		println("���Ͻ���ȷ��IP��ַƥ�䷽����");
		println(IP2.matches("[0-2][0-9][0-9]\\.[0-2][0-9][0-9]\\.[0-2][0-9][0-9]\\.[0-2][0-9][0-9]"));
		
		String IP3="292.192.168.168";
		//292 
		println(IP3.matches("[0-2][0-9][0-9]\\.[0-2][0-9][0-9]\\.[0-2][0-9][0-9]\\.[0-2][0-9][0-9]"));
		
	
		
		println("ƥ������Ϊ0-5�����֣����ִ���Ϊ5��50�ε�");
		println("12304213025".matches("[0-5]{5,50}"));
		
		

	}

	public static void println(Object obj) {

		System.out.println(obj);
	}

}
