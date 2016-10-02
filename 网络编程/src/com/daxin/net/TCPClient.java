package com.daxin.net;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.SocketAddress;

public class TCPClient {
	public static void main(String[] args) throws   Throwable {
		
		Socket sk=new Socket("127.0.0.1", 8808);
//		SocketAddress endpoint = null;
//		int timeout=600;
//		sk.connect(endpoint, timeout);
		
		//通信使用的是流,DataOutPutStream好用，使用writeUTF
		
		OutputStream out=sk.getOutputStream();
		
//		OutputStreamWriter w=new OutputStreamWriter(out);
//		w.write("Hello World ! ");
//		w.flush();
//		w.close();
		
		DataOutputStream dos=new DataOutputStream(out);
		dos.writeUTF("Hello World .");
		dos.flush();
		dos.close();
		sk.close();
		
		
		
	}

}
