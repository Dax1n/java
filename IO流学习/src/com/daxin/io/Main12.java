package com.daxin.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * 
 *  Print�� ֻ���������û��������
 * 
 *  PrintWriter��PrintStream ����������ֱ�����ַ������ֽ�����û��PrintReader����ࣩ
 * 
 * 
 *  PrintWriter��PrintStream �ṩ�����ص�print��println����
 * 
 * 
 *  PrintWriter��PrintStream ����������ᱨ�쳣���쳣�ڲ������ˣ���
 *  
 *  PrintWriter��PrintStream ���Զ�flush����
 * 
 * 	//System.out ���������
		PrintStream out = System.out; ��System.in��Ӧ��System.in��һ��������
		
		
 * @author Dax1n
 *
 */
public class Main12 {
	public static void main(String[] args) throws Throwable {
		
		
		FileOutputStream fos=new FileOutputStream("Main12.txt");
		PrintStream ps=new PrintStream(fos);
		//����System������������λ�ã�����System�������ps��
		System.setOut(ps);
		
		for(int i=0;i<100;i++){
			
			//����������System��������������ָ�����ļ��С�����������ļ�
			System.out.print(i+" ");
			if(i%9==0){
				//����������System��������������ָ�����ļ��С�����������ļ�
				System.out.println();
			}
		}
		
		
	
		
	}

}
