package com.daxin.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 
 * DataOutputStream和DataInputStream的写读顺序必须一致，否者会出错。
 * 
 * 如果写的顺序是 int 然后double ，而读的顺序是double，int的将会是错误的数字
 * 
 * 分析：
 * 写的顺序：     int   double
 * 			====/========
 * 
 * 读的顺序是
 * 			 double    int  (将写时候的前4位int和后面double的8位的前4位组成一个double，所以会错误)
 * 			========/====
 * 
 * @author Dax1n
 *
 */
public class Main11 {
	public static void main(String[] args) throws Throwable {
		
		
	
		

		
		//FileOutputStream接受字符串为参数的构造函数
		FileOutputStream fos=new FileOutputStream("data.dat",true);
		
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeLong(1500);
		double du=Math.random();
		dos.writeDouble(du);
		dos.writeBoolean(true);
		dos.flush();
		dos.close();
		fos.close();
		 
		
		
		FileInputStream fis=new FileInputStream("data.dat");
		//DataInputStream是以java类型写出去，写出去的文件我们肉眼不可见
		DataInputStream in=new DataInputStream(fis);
		
		System.out.println("in.readLong() : "+in.readLong());
		System.out.println("in.readDouble() : "+in.readDouble() );
		System.out.println("in.readBoolean() : "+in.readBoolean());
		in.close();
		fis.close();
		
		

	}
}
