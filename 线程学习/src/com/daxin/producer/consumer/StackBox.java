package com.daxin.producer.consumer;

/**
 * 
 * 接口就是使用多态，传递子类
 * 
 * @author 青春常驻Dax1n
 *
 */
public interface StackBox {

	public void push(Bread bread) ;

	public Bread pop();
}
