package com.daxin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NoneCapture {

	// �ǲ���

	public static void main(String[] args) {

		Pattern p1 = Pattern.compile("(?=a).{3}");// (?=a)д��ǰ���ǲ���

		Pattern p = Pattern.compile(".{3}(?=a)");
		String s = "abca456";// �����ַ����������ַ�������һ��a���������ַ���ȡ���������ǲ������һ��a�������

		Matcher m = p.matcher(s);

		if (m.find()) {
			System.out.println(m.group());
		} else {
			System.out.println("not found...");
		}

		System.out.println(" ��ǰ���� :");

		backRefenrence();

	}

	/**
	 * ��ǰ����
	 * 
	 */
	public static void backRefenrence() {

		// �����(\\d\\d) �������֣� \\1��ʾ����ĺ�ǰ�������������ͬ��ƥ�����
		//���������1��ʾ��ǰ���ú͵ڼ������ͬ��1�ͱ�ʾ�͵�һ����ͬ
		Pattern p = Pattern.compile("(\\d\\d)\\1");

		String s = "1212";// 12���滹��12��ǰ����������12ƥ�䣬���Գɹ�
		Matcher m = p.matcher(s);

		System.out.println(m.matches());

	}

}
