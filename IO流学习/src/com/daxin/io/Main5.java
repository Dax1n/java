package com.daxin.io;

import java.io.FileWriter;
import java.io.IOException;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter out=null;		//输出流的相关类智能帮你创建文件，但是不会帮你创建目录
		String fileName="C:\\javaWorkSpace\\IO流学习\\src\\com\\daxin\\io\\copyFile.dat";
		
		try {
			out=new FileWriter(fileName);
			for(int i=0;i<50000;i++){
				out.write(i);
				
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
