package com.daxin.second;

/**
 * inter1,inter2接口中都有foo方法，如果子类实现两个接口不重写foo的话，编译错误
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
