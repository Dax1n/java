package com.daxin.returnfinally;

/**
 * 
 * @author daxin
 * 
 * @email leodaxin@163com
 * 
 * @date 2017��4��10�� ����1:22:00
 * 
 * 
 * 
 *       finally���е�return���Ḳ��ǰ���return���(try�顢catch���е�return���),
 *       �������finally������return��䣬Eclipse�������ᱨ����"finally block does not complete
 *       normally".
 * 
 */
public class Main3 {

	public static int returnFinally() {
		int x;
		try {
			x = 1;
			return x;// return1���
		} catch (Exception e) {
			x = 2;
			return x;// return2���
		} finally {
			x = 3;
			return x;
		}
	}

	public static void main(String[] args) {
		System.out.println(returnFinally());
	}

}
