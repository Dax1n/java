package com.daxin.producer.consumer;

/**
 * 
 * 存储面包的容器，栈结构
 * 
 * @author 青春常驻Dax1n
 *
 *         StackBoxV2:StackBox的第一个版本V2
 *
 */
public class StackBoxV2 implements StackBox {
	private Bread[] box = new Bread[6];
	private int index = 0;

	/**
	 * 必须同步，保证push代码原子性执行，如果在放入容器之后，index没有++时候消费会出现错误
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
		this.notify();//唤醒该对象上的阻塞的线程，实际唤醒的是pop
		box[index] = bread;
		index++;
	}

	/**
	 * 
	 * synchronized保证代码原子性执行，原因见push注释（类似）
	 * 
	 */
	public synchronized Bread pop() {

		while (0 == index) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();// while循环的原因是怕出异常跳出0==index的wait
			}

		}
		if(index==1){
			System.out.println("");
		}
		System.out.println("index= "+index);
		
		//唤醒该对象上的阻塞的线程，实际唤醒的是push
		//如果注释 下面this.notify()的话，当生产者生产满容器之后会被wait，一旦wait阻塞之后再也不会被唤醒继续生产了。可以自行注释后看结果
		 this.notify();
		index--;
		
		
		Bread b = box[index];
		return b;
	}
}
