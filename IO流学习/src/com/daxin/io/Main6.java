package com.daxin.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 
 * 
 * ���⴦�����������ڽڵ�����������������ϵ����д�����
 * 
 * 
 * @author Dax1n
 *
 */
public class Main6 {
	
	/**
	 * ���������⣬���������Ա���Ӳ��  
	 * @param args
	 */
	public static void main(String[] args) {
		String fileName="C:\\javaWorkSpace\\IO��ѧϰ\\src\\com\\daxin\\io\\Main2.java";
		FileInputStream in=null;
		  BufferedInputStream bin=null;
				  
		try {
			
			  in=new FileInputStream(fileName);//�ڵ���
			  
			  bin=new BufferedInputStream(in);//������
			  
			  System.out.println(bin.read());
			  System.out.println(bin.read());
			  System.out.println("=============");
			  bin.mark(100);//��100
			  int c=0;
			  for(int i=0;i<=10&&(c=bin.read())!=-1;i++){
				  System.out.println(c+" ");
			  }
			  System.out.println("=============");
			  bin.reset();//�ָ�����ǵ�λ��
			  
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
