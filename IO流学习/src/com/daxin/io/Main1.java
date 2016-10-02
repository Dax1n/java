package com.daxin.io;

import java.io.InputStream;
import java.io.Writer;

/**
 * 
 * 
 * IO流
 * 
 * 
 * 按照数据流的方向不同分为：输入流和输出流（输入流还是输出流都是站在程序的角度去判断输入输出）
 * 
 * 按照处理数据的单位分：字节流和字符流（字节流是最底层的0或者1，字符流是一个一个字符向外读 ）
 * 
 * 按照功能分：节点流和处理流 （直接的）
 * 
 * Java SDK中所有的流都分别继承一下四个类：
 * 
 * InputStream , OutputStream (抽象类)
 * 
 * Reader, Writer (抽象类)
 * 
 * 
 * @author Dax1n
 *
 */
public class Main1 {

	public static void main(String[] args) {

		// public abstract class InputStream
		// InputStream的read一次读取一个字节返回和read(byte []buffer)缓冲区读取

		// read(byte []buffer,int offset,int length)

		// outputstream 类似，不解释了

		// public abstract class Writer

		// Reader数据的单位是16bit（两个字节） 因为一个汉字在java中是两个字节

	}

}
