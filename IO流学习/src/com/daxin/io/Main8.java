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
		
		
		//OutputStreamWriter是把OutputStream转成Writer,将原来的字节读取变成字符读取
		//例如：如果你想往字节流写东西的话，你可以在现有的字节流上面套一层字符流之后按字符往外写
 		OutputStreamWriter out=new OutputStreamWriter(new FileOutputStream("data.txt",true),"utf-8");
 		
 		// \r\n是回车
 		out.write("Hello,I am Dax1n . \r\n");
 		
 		
 		System.out.println(out.getEncoding());
 		out.close();
 		
 		
 		
 	
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
	}

}
