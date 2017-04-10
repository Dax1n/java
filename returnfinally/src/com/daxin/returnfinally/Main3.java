package com.daxin.returnfinally;

/**
 * 
 * @author daxin
 * 
 * @email leodaxin@163com
 * 
 * @date 2017年4月10日 下午1:22:00
 * 
 * 
 * 
 *       finally块中的return语句会覆盖前面的return语句(try块、catch块中的return语句),
 *       所以如果finally块中有return语句，Eclipse编译器会报警告"finally block does not complete
 *       normally".
 * 
 */
public class Main3 {

	public static int returnFinally() {
		int x;
		try {
			x = 1;
			return x;// return1语句
		} catch (Exception e) {
			x = 2;
			return x;// return2语句
		} finally {
			x = 3;
			return x;
		}
	}

	public static void main(String[] args) {
		System.out.println(returnFinally());
	}

}
