package com.daxin.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main9 {
	public static void main(String[] args) throws Throwable {
		// ��InputStreamת��Reader
		// System.inʵ���Ͻ��ܵ��Ǽ�������
		InputStreamReader isr = new InputStreamReader(System.in);

		// �ڰ�һ�㣬����ΪBufferedReader��readLine����
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
