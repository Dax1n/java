package com.dax1n.defaultmethod;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * 
 * Java8 ������̽��
 * 
 * @author Dax1n
 *
 */
public interface Animal {
	
 
	/**
	 * 
	 * ava8���������ڲ��ƻ�Java����ʵ�ּܹ�������������ӿ��������·���������Default������Java8 <br>
	 * default������ 
	 * һ��Ҳ�У�������չ����
	 * 
	 */
	public default void run() {

		System.out.println("Animal is running...");

	}

	/**
	 * �ӿ��п�����main����
	 *
	 * ������չ������Virtual extension methods����ͨ��Ҳ��֮Ϊ defender ����
	 *
	 * Java�ӿ����ڿ����зǳ��󷽷��ˡ�Default ���������ĺô��ǣ����ӿ�����һ��Default �����������ƻ����е�ʵ�ּܹ���
	 *
	 * ������ˣ�Default �������ʺϹ���ʹ�ã����Ƕ���Java����API���Ż����������ﵽ�޷�ؽ��Lambda���ʽ��˵��Default
	 * ������������Ҫ�����ԡ�
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("������棬�ӿ��п�����main����...");

		ArrayList<Integer> data = new ArrayList<>();
		data.add(1);
		data.add(2);
		data.add(3);
		data.add(4);
		data.forEach(System.out::println);// Lambda code goes here

	}

}
