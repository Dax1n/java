package cn.itcast.movie.example;
/**
 * 同步代码块的锁对象可以使类的任意对象
 * 
 * 
 * 
 * 同步方法的锁对象：是this，如果同步代码块和同步方法一起使用的话，将同步代码块的锁对象设置为this
 * 
 * 
 * 
 * 
 * 静态成员的锁对象：该类的.class文件
 * 
 * 
 * @author 青春常驻Dax1n
 *
 */
class SellTicketRunnale implements Runnable {

	private int ticketNums = 100;

	//同步代码块的锁对象可以使类的任意对象
	private Object obj = new Object();

	@Override
	public void run() {

		while (true) {
			synchronized (obj) {
				if (ticketNums > 0) {
					System.out.println(Thread.currentThread().getName()
							+ "正在出售第" + ticketNums-- + "张票...");
				} else {
					break;
				}
			}

		}

	}
}

public class SellTicketRunnaleDemo {
	public static void main(String[] args) {
		SellTicketRunnale st = new SellTicketRunnale();
		Thread t1 = new Thread(st, "窗口1");
		Thread t2 = new Thread(st, "窗口2");
		Thread t3 = new Thread(st, "窗口3");

		t1.start();
		t2.start();
		t3.start();
	}
}
