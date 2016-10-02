package com.daxin.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 
 * 
 * 讲解处理流，包含在节点流（最基本的流）上的流叫处理流
 * 
 * 
 * @author Dax1n
 *
 */
public class Main6 {
	
	/**
	 * 缓冲流讲解，缓冲流可以保护硬盘  
	 * @param args
	 */
	public static void main(String[] args) {
		String fileName="C:\\javaWorkSpace\\IO流学习\\src\\com\\daxin\\io\\Main2.java";
		FileInputStream in=null;
		  BufferedInputStream bin=null;
				  
		try {
			
			  in=new FileInputStream(fileName);//节点流
			  
			  bin=new BufferedInputStream(in);//处理流
			  
			  System.out.println(bin.read());
			  System.out.println(bin.read());
			  System.out.println("=============");
			  bin.mark(100);//在100
			  int c=0;
			  for(int i=0;i<=10&&(c=bin.read())!=-1;i++){
				  System.out.println(c+" ");
			  }
			  System.out.println("=============");
			  bin.reset();//恢复到标记的位置
			  
			  for(int i=0;i<=10&&(c=bin.read())!=-1;i++){
				  System.out.println(c+" ");
			  }
			  System.out.println("=============");
			  bin.close();
			  in.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
