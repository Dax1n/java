package com.daxin.producer.consumer;

/**
 * 
 * 面包
 * 
 * 
 * @author 青春常驻Dax1n
 *
 */
public class Bread {
	public int id;

	public Bread(int id) {
		super();// 必须第一行，否则编译错误
		this.id = id;
	}

	@Override
	public String toString() {
		return "Bread的id=" + id ;
	}

}
