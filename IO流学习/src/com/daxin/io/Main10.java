package com.daxin.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * ������
 * 
 * DataInputStream��DataOutputStream �ֱ�̳�InputStream��OutputStream
 * 
 * �������ڴ�������DataInputStream��DataOutputStream�ṩ�˿ɴ�ȡ������޹ص�Javaԭʼ�������ݵķ��� 
 * 
 * @author Dax1n
 *
 */
public class Main10 {
	
	public static void main(String[] args) throws Throwable {
		
		//���ڴ��з���һ���ֽ�������
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
	
		
		DataOutputStream dos=new DataOutputStream(baos);
		
		dos.writeDouble(Math.random());
		dos.writeBoolean(true);
		
		
		
		
		
		ByteArrayInputStream bais=new ByteArrayInputStream(baos.toByteArray());
		
		System.out.println("bais.available() : "+bais.available());
		
		DataInputStream dis=new DataInputStream(bais);
		System.out.println(dis.readBoolean());
		System.out.println(dis.readDouble());
		dis.close();
		dos.close();
		baos.close();
		bais.close();
		
		
		
		
	}

}
