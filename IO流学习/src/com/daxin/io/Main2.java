package com.daxin.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main2 {
	
	public static void main(String[] args) {
		
		String fileName="C:\\javaWorkSpace\\IO��ѧϰ\\src\\com\\daxin\\io\\Main2.java";
		FileInputStream in=null;
		try {
			  in=new FileInputStream(fileName);
			  int b=0;
			  int count=0;
			  
			 while((b=in.read())!=-1){
				 
				 //���û��еĻ����԰���Դ�ļ���ʽ����
				//���������룬��������ԭ��
				 // ��Ϊ�����������ֽ���ɣ����㰴���ֽ���ÿ��һ���ֽ�һ���ֽڵĶ�ȡ�Ļ�����ȡһ���ֽھ�ǿ��ת����
				 //����ֻ�������룬�ĳ�Reader����
				 
				 System.out.print((char)b);
				 count++;
			 }
			  
			 System.out.println("count: "+count);
			 System.out.println("�����ȡ�������...");
			  
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
