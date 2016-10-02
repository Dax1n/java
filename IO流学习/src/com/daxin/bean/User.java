package com.daxin.bean;

import java.io.Serializable;

/**
 * 序列化必须实现Serializable接口
 * 
 * Serializable是一个标志
 * 
 * 
 * @author Dax1n
 *
 */
public class User implements Serializable{
	private String userName;
	
	/**
	 * transient 不序列化，基本类型有默认值，引用类型的为NULL
	 */
	private transient String passWord;
	
	
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

}
