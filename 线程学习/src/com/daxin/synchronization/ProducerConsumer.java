package com.daxin.synchronization;

/**
 * 
 * @author ��ʿ��
 *
 *		wait������˵����
 *         Causes the current thread to wait until another thread invokes the
 *         notify() method or the notifyAll() method for this object. In other
 *         words, this method behaves exactly as if it simply performs the call
 *         wait(0). The current thread must own this object's monitor. The
 *         thread releases ownership of this monitor and waits until another
 *         thread notifies threads waiting on this object's monitor to wake up
 *         either through a call to the notify method or the notifyAll method.
 *         The thread then waits until it can re-obtain ownership of the monitor
 *         and resumes execution.
 * 
 *         As in the one argument version, interrupts and spurious wakeups are
 *         possible, and this method should always be used in a loop:
 * 
 *         synchronized (obj) { while (<condition does not hold>) obj.wait();
 *         ... // Perform action appropriate to condition }
 * 
 *         This method should only be called by a thread that is the owner of
 *         this object's monitor. See the notify method for a description of the
 *         ways in which a thread can become the owner of a monitor.
 *
 *
 */
public class ProducerConsumer {
	public static void main(String[] args) {
		SyncStack ss = new SyncStack();
		Producer p = new Producer(ss);
		Consumer c = new Consumer(ss);
		new Thread(p).start();
		new Thread(p).start();
		new Thread(p).start();
		new Thread(c).start();
	}
}

class WoTou {
	int id;

	WoTou(int id) {
		this.id = id;
	}

	public String toString() {
		return "WoTou : " + id;
	}
}

class SyncStack {
	int index = 0;
	WoTou[] arrWT = new WoTou[6];

	public synchronized void push(WoTou wt) {
		// ʹ��while��ԭ���ǵ������쳣ʱ�򣬼�������ִ��
		while (index == arrWT.length) {
			try {
				this.wait();// wait�����ڳ�������ʱ�����wait��wait״̬ʱ���ͷ���������sleep�ǲ��ͷ�����
			} catch (InterruptedException e) {
				e.printStackTrace();// ����쳣����ʱ����index ==
									// arrWT.length�Ļ���ʹ��if�ͼ�������ִ���ˣ����������±�Խ��
			}
		}
		this.notifyAll();//����pop��wait
		arrWT[index] = wt;
		index++;
	}

	public synchronized WoTou pop() {
		// ʹ��while��ԭ���ǵ������쳣ʱ�򣬼�������ִ��
		while (index == 0) {
			try {
				this.wait();// wait�����ڳ�������ʱ�����wait��wait״̬ʱ���ͷ���������sleep�ǲ��ͷ�����
			} catch (InterruptedException e) {
				e.printStackTrace();// ����쳣����ʱ����index ==
									// arrWT.length�Ļ���ʹ��if�ͼ�������ִ���ˣ����������±�Խ��
			}
		}
		this.notifyAll();//����push��wait
		index--;
		return arrWT[index];
	}
}

class Producer implements Runnable {
	SyncStack ss = null;

	Producer(SyncStack ss) {
		this.ss = ss;
	}

	public void run() {
		for (int i = 0; i < 20; i++) {
			WoTou wt = new WoTou(i);
			ss.push(wt);
			System.out.println("�����ˣ�" + wt);
			try {
				Thread.sleep((int) (Math.random() * 2));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable {
	SyncStack ss = null;

	Consumer(SyncStack ss) {
		this.ss = ss;
	}

	public void run() {
		for (int i = 0; i < 20; i++) {
			WoTou wt = ss.pop();
			System.out.println("������: " + wt);
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}