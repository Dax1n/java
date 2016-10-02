package com.daxin.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * 
 * @author Dax1n
 *
 */
public class Main4 {
	public static void main(String[] args) {

		FileReader in = null;

		String fileName = "C:\\javaWorkSpace\\IO流学习\\src\\com\\daxin\\io\\Main2.java";
		try {
			in = new FileReader(fileName);
			int b = 0;

			while ((b = in.read()) != -1) {

				// 这个是两个字节向外读取，两个字节强制转换成汉字是没有问题的
				System.out.print((char) b);

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
