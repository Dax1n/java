package com.daxin.bean;

import java.io.Serializable;

/**
 * ���л�����ʵ��Serializable�ӿ�
 * 
 * Serializable��һ����־
 * 
 * 
 * @author Dax1n
 *
 */
public class User implements Serializable{
	private String userName;
	
	/**
	 * transient �����л�������������Ĭ��ֵ���������͵�ΪNULL
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
