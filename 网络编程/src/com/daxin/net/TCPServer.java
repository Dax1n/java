package com.daxin.net;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 
 * @author Dax1n
 *
 */
public class TCPServer {
	public static void main(String[] args) throws Throwable {

		ServerSocket ss = new ServerSocket(8808);

		
		Socket socket =null;
		while (true) {
			  socket = ss.accept();
//			  InputStreamReader r=new InputStreamReader(socket.getInputStream());
			  
//			  BufferedReader br=new BufferedReader(r);
//			  String data=br.readLine();
//			  while(data!=null){
//				  System.out.println("接收到的数据为: "+ br.readLine());
//				  data=br.readLine();
//			  }
//			 
			 
			  DataInputStream dis=new DataInputStream(socket.getInputStream());
			  
			  
			  System.out.println(dis.readUTF());
//			  br.close();
//			  r.close();
			  
			
		}

	}

}
