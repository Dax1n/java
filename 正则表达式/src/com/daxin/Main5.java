package com.daxin;

/**
 * 
 * �߽�ƥ��
 * 
 * @author Dax1n
 *
 */
public class Main5 {

	public static void main(String[] args) {
		
		//^����������ʹ�õĻ������ַ��Ŀ�ʼ�����ת���ַ���ʾ��ʼ�ַ���H�ģ�������0�����߶�����ַ�
		 p("Hello Sir".matches("^H.*"));
		 
		 
		 
		 //$��ʾ��ʲô��β���ַ�
		 p("Hello Sir".matches(".*ir$"));
		 
		 
//		  //b��ʾ���ʱ߽�
		 p("Hello Sir".matches("^H[a-z]{3}o\\b.*"));
		 p("HelloSir".matches("^H[a-z]{3}o\\b.*"));
		
		
	}
	public static void p(Object obj) {

		System.out.println(obj);
	}
}
