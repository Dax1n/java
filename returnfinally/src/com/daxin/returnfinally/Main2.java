package com.daxin.returnfinally;

/**
 * 
 * @author daxin
 * 
 * @email leodaxin@163com
 * 
 * @date 2017��4��10�� ����1:22:00
 * 
 */
public class Main2 {
	public static int test() {
		int x;
		try {
			x = 1;//ֻҪ�˴�Ҫreturn1��û���쳣�Ļ����͸��ƴ�ʱ��xֵ��returnValue�У�Ȼ��ִ��finally����е�x=3 
			if(true){
				throw  new Exception();//
			}
			return x;//return1���     ���쳣����1
		} catch (Exception e) {
			x = 2;//    �쳣����2 
			return x;//return2���
		} finally {
			x = 3;
			return x;
		}
	}

	public static void main(String[] args) {
		System.out.println(test());
	}

}
