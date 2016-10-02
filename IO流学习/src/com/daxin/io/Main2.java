package com.daxin.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main2 {
	
	public static void main(String[] args) {
		
		String fileName="C:\\javaWorkSpace\\IO流学习\\src\\com\\daxin\\io\\Main2.java";
		FileInputStream in=null;
		try {
			  in=new FileInputStream(fileName);
			  int b=0;
			  int count=0;
			  
			 while((b=in.read())!=-1){
				 
				 //不用换行的话可以按照源文件格式读出
				//有中文乱码，中文乱码原因：
				 // 因为中文是两个字节组成，而你按照字节流每次一个字节一个字节的读取的话，读取一个字节就强制转换成
				 //中文只能是乱码，改成Reader即可
				 
				 System.out.print((char)b);
				 count++;
			 }
			  
			 System.out.println("count: "+count);
			 System.out.println("程序读取数据完毕...");
			  
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
