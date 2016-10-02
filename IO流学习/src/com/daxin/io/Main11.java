package com.daxin.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 
 * DataOutputStream��DataInputStream��д��˳�����һ�£����߻����
 * 
 * ���д��˳���� int Ȼ��double ��������˳����double��int�Ľ����Ǵ��������
 * 
 * ������
 * д��˳��     int   double
 * 			====/========
 * 
 * ����˳����
 * 			 double    int  (��дʱ���ǰ4λint�ͺ���double��8λ��ǰ4λ���һ��double�����Ի����)
 * 			========/====
 * 
 * @author Dax1n
 *
 */
public class Main11 {
	public static void main(String[] args) throws Throwable {
		
		
	
		

		
		//FileOutputStream�����ַ���Ϊ�����Ĺ��캯��
		FileOutputStream fos=new FileOutputStream("data.dat",true);
		
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeLong(1500);
		double du=Math.random();
		dos.writeDouble(du);
		dos.writeBoolean(true);
		dos.flush();
		dos.close();
		fos.close();
		 
		
		
		FileInputStream fis=new FileInputStream("data.dat");
		//DataInputStream����java����д��ȥ��д��ȥ���ļ��������۲��ɼ�
		DataInputStream in=new DataInputStream(fis);
		
		System.out.println("in.readLong() : "+in.readLong());
		System.out.println("in.readDouble() : "+in.readDouble() );
		System.out.println("in.readBoolean() : "+in.readBoolean());
		in.close();
		fis.close();
		
		

	}
}
