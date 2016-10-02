package com.daxin.io;

import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * 
 * 输出的writer
 * 
 * 
 * @author Dax1n
 *
 */
public class Main13 {
	public static void main(String[] args) throws Throwable {
		
		PrintWriter pw=new PrintWriter(new FileOutputStream("Main13.txt",true));
		
		for(int i=0;i<100;i++){
			pw.write("我是青春常驻Dax1n，我最帅！" +i+" \r\n");
		
		}
		
		pw.close();
		
	}

}
