package com.daxin.producer.consumer;

/**
 * 
 * �洢�����������ջ�ṹ
 * 
 * @author �ഺ��פDax1n
 *
 *StackBoxV1:StackBox�ĵ�һ���汾V1 
 *
 */
public class StackBoxV1 implements StackBox{
	private Bread[] box = new Bread[6];
	private int index = 0;

	public void push(Bread bread) {
		//û�м��жϣ�������������������֮������ӻ�����ָ��Խ�磬��StackBoxV2
		box[index] = bread;
		index++;
	}

	public Bread pop() {
		//û�м��жϣ������������ѿ�����֮�������ѻ�����ָ��Խ�磬��StackBoxV2
		index--;
		return box[index];
	}
}
