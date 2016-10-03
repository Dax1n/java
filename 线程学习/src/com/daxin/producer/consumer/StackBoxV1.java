package com.daxin.producer.consumer;

/**
 * 
 * 存储面包的容器，栈结构
 * 
 * @author 青春常驻Dax1n
 *
 *StackBoxV1:StackBox的第一个版本V1 
 *
 */
public class StackBoxV1 implements StackBox{
	private Bread[] box = new Bread[6];
	private int index = 0;

	public void push(Bread bread) {
		//没有加判断，在生产者生产满容器之后再添加会数组指针越界，见StackBoxV2
		box[index] = bread;
		index++;
	}

	public Bread pop() {
		//没有加判断，在消费者消费空容器之后再消费会数组指针越界，见StackBoxV2
		index--;
		return box[index];
	}
}
