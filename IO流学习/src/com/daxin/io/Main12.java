package com.daxin.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * 
 *  Print流 只有输出流，没有输入流
 * 
 *  PrintWriter和PrintStream 是输出流，分别针对字符流和字节流（没有PrintReader这个类）
 * 
 * 
 *  PrintWriter和PrintStream 提供了重载的print和println方法
 * 
 * 
 *  PrintWriter和PrintStream 输出操作不会报异常（异常内部处理了）。
 *  
 *  PrintWriter和PrintStream 有自动flush功能
 * 
 * 	//System.out 就是输出流
		PrintStream out = System.out; 与System.in对应，System.in是一个输入流
		
		
 * @author Dax1n
 *
 */
public class Main12 {
	public static void main(String[] args) throws Throwable {
		
		
		FileOutputStream fos=new FileOutputStream("Main12.txt");
		PrintStream ps=new PrintStream(fos);
		//设置System的输出流的输出位置，设置System的输出到ps中
		System.setOut(ps);
		
		for(int i=0;i<100;i++){
			
			//由于设置了System的输出流输出方向，指定到文件中。所以输出到文件
			System.out.print(i+" ");
			if(i%9==0){
				//由于设置了System的输出流输出方向，指定到文件中。所以输出到文件
				System.out.println();
			}
		}
		
		
	
		
	}

}
