package com.daxin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * �ַ������滻
 * 
 * 
 * @author Dax1n
 *
 */
public class Main8 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("java", Pattern.CASE_INSENSITIVE);// ��Сд�����У����Ǻ��Դ�Сд
		Matcher m = p.matcher("java Java JaVA IlovejAVA sdfsdf");
		// mƥ��֮�����Matcher�ķ������滻��ƥ�����������

		// ����1���ҵ���javaת��Ϊ��дJAVA
		p(m.replaceAll("JAVA"));
		// ����2���ҵ�������java��ΪСд��ż����java��Ϊ��д
		m.reset();// ����
		int i = 1;
		StringBuffer sb=new StringBuffer();
		while (m.find()) {
//			appendReplacementʵ��Ī�Ǿ�������ƴ��һ���ַ�������
			if (i % 2 == 0) {
				// ����
				m.appendReplacement(sb, "java");//ʹ�ú�����滻��ǰƥ����ַ�����Ȼ��浽sb��

			} else {
				// ż��
				m.appendReplacement(sb, "JAVA");//ʹ�ú�����滻��ǰƥ����ַ�����Ȼ��浽sb��


			}
			i++;

		}
		
		
		p("����β�Ͳ����ˣ����Ǻ���δƥ�����һ���ֲ�����");
		
		p("sb: "+sb);
		
		p("���β�͵��ַ�����");
		m.appendTail(sb);
		p("sb: "+sb);
		m.reset();
		while (m.find()) {
			p(m.group());//
		}

	}

	public static void p(Object obj) {

		System.out.println(obj);
	}
}
