package com.daxin.producer.consumer;

/**
 * 
 * �洢�����������ջ�ṹ
 * 
 * @author �ഺ��פDax1n
 *
 *         StackBoxV2:StackBox�ĵ�һ���汾V2
 *
 */
public class StackBoxV2 implements StackBox {
	private Bread[] box = new Bread[6];
	private int index = 0;

	/**
	 * ����ͬ������֤push����ԭ����ִ�У�����ڷ�������֮��indexû��++ʱ�����ѻ���ִ���
	 * 
	 */
	public synchronized void push(Bread bread) {

		while (box.length == index) {

			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		this.notify();//���Ѹö����ϵ��������̣߳�ʵ�ʻ��ѵ���pop
		box[index] = bread;
		index++;
	}

	/**
	 * 
	 * synchronized��֤����ԭ����ִ�У�ԭ���pushע�ͣ����ƣ�
	 * 
	 */
	public synchronized Bread pop() {

		while (0 == index) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();// whileѭ����ԭ�����³��쳣����0==index��wait
			}

		}
		if(index==1){
			System.out.println("");
		}
		System.out.println("index= "+index);
		
		//���Ѹö����ϵ��������̣߳�ʵ�ʻ��ѵ���push
		//���ע�� ����this.notify()�Ļ���������������������֮��ᱻwait��һ��wait����֮����Ҳ���ᱻ���Ѽ��������ˡ���������ע�ͺ󿴽��
		 this.notify();
		index--;
		
		
		Bread b = box[index];
		return b;
	}
}
