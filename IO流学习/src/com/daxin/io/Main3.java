package com.daxin.io;
import java.io.*;

public class Main3 {
	
	

	public static void main(String[] args)   {
		String fileName="C:\\javaWorkSpace\\IO��ѧϰ\\src\\com\\daxin\\io\\Main2.java";
		String copyFileName="C:\\javaWorkSpace\\IO��ѧϰ\\src\\com\\daxin\\io\\copy.java";
		
		
		// TODO Auto-generated method stub
		FileInputStream in=null;
		//���������������ܰ��㴴���ļ������ǲ�����㴴��Ŀ¼
		FileOutputStream out=null;
		
		try {
			int b=0;
			in=new FileInputStream(fileName);
			out=new FileOutputStream(copyFileName);
			while((b=in.read())!=-1){
				
				out.write(b);
				
			}
			
			
			
			
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				out.close();
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		

	}

}
