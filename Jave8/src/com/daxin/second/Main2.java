package com.daxin.second;

/**
 * inter1,inter2�ӿ��ж���foo�������������ʵ�������ӿڲ���дfoo�Ļ����������
 * @author Dax1n
 *
 */
public class Main2 implements inter1,inter2 {

	@Override
	public void foo() {
		 System.out.println("Main2 ...");
	}
	public static void main(String[] args) {
		Main2 m=new Main2();
		m.foo();
		
		
	}
 

}
