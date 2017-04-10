package com.daxin.returnfinally;

/**
 * 
 * @author daxin
 * 
 * @email leodaxin@163com
 * 
 * @date 2017年4月10日 下午1:22:00
 * 
 */
public class Main2 {
	public static int test() {
		int x;
		try {
			x = 1;//只要此处要return1处没有异常的话，就复制此时的x值到returnValue中，然后执行finally语句中的x=3 
			if(true){
				throw  new Exception();//
			}
			return x;//return1语句     不异常返回1
		} catch (Exception e) {
			x = 2;//    异常返回2 
			return x;//return2语句
		} finally {
			x = 3;
			return x;
		}
	}

	public static void main(String[] args) {
		System.out.println(test());
	}

}
