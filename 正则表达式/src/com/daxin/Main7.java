package com.daxin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * Matcher
 * 
 * @author Dax1n
 *
 */
public class Main7 {

	public static void main(String[] args) {
		
		String s="123-45632-235-88";
		
		Pattern p=Pattern.compile("\\d{3,5}");
		
		Matcher m = p.matcher(s);
		
		p("m.matches() : "+m.matches());// ����matches֮��ƥ���ָ���Ѿ������ַ������ʼ
		
		m.reset();//����ƥ��λ�õ��ַ����Ŀ�ʼ
		
		p(m.find());//��ƥ����ִ�
		p(m.start()+" "+m.end());//start��ƥ���ϵ��ַ����Ŀ�ʼλ�ã�end��ƥ���ϵĽ�����λ��
		p(s.substring(m.start(), m.end()));
		
		
		p(m.find());
		p(m.start()+" "+m.end());//start��ƥ���ϵ��ַ����Ŀ�ʼλ�ã�end��ƥ���ϵĽ�����λ��
		p(m.find());//����Ҳ����Ļ�����start��end����
		p(m.start()+" "+m.end());//start��ƥ���ϵ��ַ����Ŀ�ʼλ�ã�end��ƥ���ϵĽ�����λ��
		
		p("lookingAt:");
		p(m.lookingAt());//lookingAt�Ǵӿ�ʼ��λ�ÿ�ʼ��
		p(m.lookingAt());//Ҳ�Ǵ�ͷ��
		p(m.lookingAt());//Ҳ�Ǵ�ͷ��
		p(m.lookingAt());//Ҳ�Ǵ�ͷ��
		
		
		
		
				

	}

	public static void p(Object obj) {

		System.out.println(obj);
	}

}
