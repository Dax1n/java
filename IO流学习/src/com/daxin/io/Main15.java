package com.daxin.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.daxin.bean.User;

/**
 * 对象流：序列化
 * 
 * @author Dax1n
 *
 */
public class Main15  {
	
	public static void main(String[] args) throws Throwable, IOException {
	
		User user=new User();
		user.setUserName("青春常驻Dax1n");
		user.setPassWord("123456");
		user.setAge(18);
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("user.dat"));
		oos.writeObject(user);
		
		oos.close();
		
		System.out.println("序列化完毕.....");
		
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("user.dat"));
		User dax1n = (User)ois.readObject();
		System.out.println("dax1n.getUserName() : "+dax1n.getUserName());
		System.out.println("dax1n.getPassWord() : "+dax1n.getPassWord());
		System.out.println("dax1n.getAge() : "+dax1n.getAge());
		
		
	}

}
