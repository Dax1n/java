package com.daxin;

/**
 * 
 * 
 * ������ʽ��Χ
 * 
 * @author Dax1n
 *
 */
public class Main3 {
	public static void main(String[] args) {
		
		//�����ű�ʾ��һ��ƥ���Ͼ���
		println("a".matches("[abc]"));

		
		
		//^ȡ������˼����abc
		println("a".matches("[^abc]"));
		
		
		//a-z��A-Z���ַ���
		println("a".matches("[a-zA-Z]"));
		
		//����д��һֱ
		println("A".matches("[a-z]|[A-Z]"));
		
		//A-Z&&[RFG]  ��A-Z�в�����RFG�е�һ����������
		println("R".matches("[A-Z&&[RFG]]"));
		
		
		
		
		
	}

	public static void println(Object obj) {

		System.out.println(obj);
	}
}
