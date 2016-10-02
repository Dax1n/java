package com.daxin.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main7 {
	
	public static void main(String[] args) {
		
		try {
			/**
			 * 
			 * 下面四个处理流：
			 * BufferedWriter和BufferedReader
			 * BufferedInputStream和BufferedOutputStream
			 */
			
			
			BufferedWriter bw=new BufferedWriter(new FileWriter("data.txt"));
			BufferedReader br=new BufferedReader(new FileReader("data.txt"));
			
			String data=null;
			for(int i=0;i<100;i++){
				data=String.valueOf(Math.random());
				bw.write(data);
				bw.newLine();
			}
			bw.flush();
			bw.close();
			
			
			while((data=br.readLine())!=null){
				System.out.println(data);
			}
			br.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
