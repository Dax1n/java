package com.daxin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author �ഺ��פDax1n
 *
 *         qualifier��ʹ��
 *
 *         qualifier������
 */
public class Main10 {

	public static void main(String[] args) {

		// Greedy ̰����
		// Reluctant ����Ը��
		Greedy();
		Reluctant();
		Possessive();

	}
	
	public static void Greedy(){
		
		String data = "aaaa5bbbb4";

		String Reluctant = "(.{3,10})[0-9]";//̰���Ƶģ�ֱ�Ӱ���Χ�����ֵ�̽�ȥ������ֱ�����̽�ȥ10�����Ƿ��䣿��ƥ���³���һ���ٿ��Ƿ�ƥ��
		Pattern p = Pattern.compile(Reluctant);
		Matcher m = p.matcher(data);

		if (m.find()) {
			System.out.println(m.start() + " - " + m.end());
		} else {
			System.out.println("not found ...");
		}
	}
	
	public static void Reluctant(){
		String data = "aaaa5bbbb4";

		String Reluctant = "(.{3,10}?)[0-9]";//����Ը�ģ�ֱ���̽�ȥ���ٵ�3�����Ƿ�ƥ�䣬��ƥ��Ȼ�����̽�ȥһ�������Ƿ�ƥ�䣿ֱ�����
		Pattern p = Pattern.compile(Reluctant);
		Matcher m = p.matcher(data);

		if (m.find()) {
			System.out.println(m.start() + " - " + m.end());
		} else {
			System.out.println("not found ...");
		}
	}
	
	
	/**
	 * Possessive:��ռ����˼
	 * 
	 * Ҳ��ֱ�������̽�ȥ���ǲ��£����û���ˣ�����ƥ�䲻�ϡ�����Ҳ���
	 * 
	 */
	public static void Possessive(){
		String data = "aaaa5bbbb4";//not found 
		String data1 = "aaaa5bbbb41";// �����ҵ�

		String Reluctant = "(.{3,10}+)[0-9]";//����Ը�ģ�ֱ���̽�ȥ���ٵ�3�����Ƿ�ƥ�䣬��ƥ��Ȼ�����̽�ȥһ�������Ƿ�ƥ�䣿ֱ�����
		Pattern p = Pattern.compile(Reluctant);
		Matcher m = p.matcher(data);

		if (m.find()) {
			System.out.println(m.start() + " - " + m.end());
		} else {
			System.out.println("not found ...");
		}
		
	}

}
