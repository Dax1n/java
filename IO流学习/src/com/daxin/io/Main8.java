package com.daxin.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main8 {
	public static void main(String[] args) throws Throwable {
		
		InputStream in=new FileInputStream("data.txt");
		BufferedInputStream bfi=new BufferedInputStream(in);
		
		
		//OutputStreamWriter�ǰ�OutputStreamת��Writer,��ԭ�����ֽڶ�ȡ����ַ���ȡ
		//���磺����������ֽ���д�����Ļ�������������е��ֽ���������һ���ַ���֮���ַ�����д
 		OutputStreamWriter out=new OutputStreamWriter(new FileOutputStream("data.txt",true),"utf-8");
 		
 		// \r\n�ǻس�
 		out.write("Hello,I am Dax1n . \r\n");
 		
 		
 		System.out.println(out.getEncoding());
 		out.close();
 		
 		
 		
 	
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
	}

}
