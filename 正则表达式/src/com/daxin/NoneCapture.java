package com.daxin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NoneCapture {

	// �ǲ���
	
	public static void main(String[] args) {
		
		Pattern p1=Pattern.compile("(?=a).{3}");//(?=a)д��ǰ���ǲ���

		
		Pattern p=Pattern.compile(".{3}(?=a)");
		String s="abca456";//�����ַ����������ַ�������һ��a���������ַ���ȡ���������ǲ������һ��a�������

		Matcher m = p.matcher(s);
		
		if(m.find()){
			System.out.println(m.group());
		}else{
			System.out.println("not found...");
		}
		
		
	}
}
