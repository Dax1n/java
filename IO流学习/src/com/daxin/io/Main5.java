package com.daxin.io;

import java.io.FileWriter;
import java.io.IOException;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter out=null;		//���������������ܰ��㴴���ļ������ǲ�����㴴��Ŀ¼
		String fileName="C:\\javaWorkSpace\\IO��ѧϰ\\src\\com\\daxin\\io\\copyFile.dat";
		
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
