package com.daxin.returnfinally;

/**
 * 
 * @author daxin
 * 
 * @email leodaxin@163com
 * 
 * @date 2017��4��10�� ����12:04:32
 * 
 */
public class Main1 {

	public int testMethod(String _int, String _className) {

		int x = 1;

		try {
			Integer.valueOf(_int);
			Class.forName(_className);
			// ��������������û�з����쳣������return x�����룬������ȼ�����ʽx
			// ����x�Ӿֲ����������Ƶ�������ջ����������ǲ�����ջ����ֵ��Ҳ����x��ֵ��Ϊ1
			// Ȼ�󽫲�����ջ����ֵ���Ƶ��ֲ�������(����������Ƶ��ֲ���������ֵ��returnvalue)����ִ��finally����飬��finally�����
			// �У�x��ֵ���޸�Ϊ3(���ֲ��������е�xֵ)��finallyִ���꣬�����ֽ�returnvalue���Ƶ�������ջ����Ȼ��ִ��returnָ�����
			// ������ջ����ֵ�����շ���ֵ��1
			return x;
		} catch (ClassNotFoundException e) {
			// ͬ��������ClassNotFoundException��x��ֵ���޸ĳ�2
			// �����catch�е�return x����ж����˷���ֵ��СΪ2���������շ��ص���2
			x = 2;
			return x;
		} finally {
			// ������һ����ִ�еģ�����Ĵ���ִ�н�����Ż��������������ֵ�������finally����޸�x����Ӱ�췵��ֵ����Ϊ����ֵ��return
			// �����
			// ���ʽִ������Ѿ�ȷ���ˣ�����x�Ŀ��գ�������x
			x = 3;
		}
	}

	public static void main(String[] args) {
		try {
			Main1 demo = new Main1();
			int i_1 = demo.testMethod("123123", "expert.in.java.lang.CalendarDemo");
			System.out.println(i_1);// ���Ϊ1
			int i_2 = demo.testMethod("123123", "com.edu.cn.qj.MyClass");
			System.out.println(i_2);// ���Ϊ2
			int i_3 = demo.testMethod("dsadf", "expert.in.java.lang.CalendarDemo");
			System.out.println(i_3);// û�з���ֵ�����׳��쳣
		} finally {

		}
	}

}
