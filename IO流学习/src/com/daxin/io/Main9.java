package com.daxin.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main9 {
	public static void main(String[] args) throws Throwable {
		// 把InputStream转成Reader
		// System.in实际上接受的是键盘输入
		InputStreamReader isr = new InputStreamReader(System.in);

		// 在包一层，是因为BufferedReader有readLine方法
		BufferedReader br = new BufferedReader(isr);
		String data = br.readLine();
		while (data != null) {
			if (data.equalsIgnoreCase("exit")) {
				break;
			}
			System.out.println(data.toUpperCase());
			data = br.readLine();

		}
		
		br.close();
	}
}
