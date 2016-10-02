package com.daxin.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * 键盘输入写到文件中
 * 
 * @author Dax1n
 *
 */
public class Main14 {
	public static void main(String[] args) throws Throwable {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		PrintWriter pw = new PrintWriter(new File("Main14.txt"));
		String s = br.readLine();
		while (s != null) {

			if(s.equalsIgnoreCase("exit")){break;}
			pw.write(s+"\r\n");
			s = br.readLine();

		}
		
		pw.close();
		br.close();
		
		

	}

}
