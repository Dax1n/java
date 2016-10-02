package com.daxin.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * 数据流
 * 
 * DataInputStream和DataOutputStream 分别继承InputStream和OutputStream
 * 
 * 它俩属于处理流，DataInputStream和DataOutputStream提供了可存取与机器无关的Java原始类型数据的方法 
 * 
 * @author Dax1n
 *
 */
public class Main10 {
	
	public static void main(String[] args) throws Throwable {
		
		//在内存中分配一个字节数组流
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
