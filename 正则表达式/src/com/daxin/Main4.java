package com.daxin;

/**
 * 
 * ʵ��д������ҪЩ\\ ����ת��
 * 
 * \d ����һ������
 * 
 * 
 * \D ��������� [^0-9]
 * 
 * 
 * \s ����һ���ո�
 * 
 * \S ����һ���ǿո� [^\s]
 * 
 * ^������������Ļ�������ʹ��
 * 
 * 
 * \w ����һ�������ַ�������һ�����ʣ�[a-zA-Z_0-9]
 * 
 * 
 * @author Dax1n
 *
 */
public class Main4 {

	public static void main(String[] args) {
		println(" ".matches("\\s"));

		println("\\w��[a-zA-Z_0-9]��Ч");
		println("_".matches("\\w"));

		// println("\\".matches("\\"));//��һ�д����쳣

		// ��java�� ��"\"�ᱻjava��Ϊ�� һ��" ��\"
		// ����б���ǵ���˫���ŵ�ת���ַ�������˫���ŵ��󲿵ĵ���˫�����Ҳ����ұߵ�ƥ��˫���ţ���˱���
		println("\\".matches("\\\\"));//"\\"��ʾһ��б�ߡ�������ʽƥ��"\\"��Ҫ\\\\

	}

	public static void println(Object obj) {

		System.out.println(obj);
	}
}
