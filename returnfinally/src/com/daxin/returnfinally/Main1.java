package com.daxin.returnfinally;

/**
 * 
 * @author daxin
 * 
 * @email leodaxin@163com
 * 
 * @date 2017年4月10日 下午12:04:32
 * 
 */
public class Main1 {

	public int testMethod(String _int, String _className) {

		int x = 1;

		try {
			Integer.valueOf(_int);
			Class.forName(_className);
			// 如果上面两句代码没有发生异常，对于return x这句代码，程序会先计算表达式x
			// 即将x从局部变量区复制到操作数栈顶，结果就是操作数栈顶的值，也就是x的值，为1
			// 然后将操作数栈顶的值复制到局部变量区(假设这个复制到局部变量区的值叫returnvalue)，再执行finally代码块，在finally代码块
			// 中，x的值被修改为3(即局部变量区中的x值)，finally执行完，程序又将returnvalue复制到操作数栈顶，然后执行return指令，返回
			// 操作数栈顶的值，最终返回值是1
			return x;
		} catch (ClassNotFoundException e) {
			// 同样发生了ClassNotFoundException，x的值被修改成2
			// 因此在catch中的return x语句中定义了返回值大小为2，所以最终返回的是2
			x = 2;
			return x;
		} finally {
			// 这句代码一定会执行的，这里的代码执行结束后才会结束方法并返回值，因此在finally语句修改x不会影响返回值，因为返回值在return
			// 后面的
			// 表达式执行完就已经确定了，他是x的快照，而不是x
			x = 3;
		}
	}

	public static void main(String[] args) {
		try {
			Main1 demo = new Main1();
			int i_1 = demo.testMethod("123123", "expert.in.java.lang.CalendarDemo");
			System.out.println(i_1);// 结果为1
			int i_2 = demo.testMethod("123123", "com.edu.cn.qj.MyClass");
			System.out.println(i_2);// 结果为2
			int i_3 = demo.testMethod("dsadf", "expert.in.java.lang.CalendarDemo");
			System.out.println(i_3);// 没有返回值，会抛出异常
		} finally {

		}
	}

}
