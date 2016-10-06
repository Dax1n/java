package cn.itcast.movie.example;

/**
 * 
 * 卖电影票，100张票，三个窗口售。
 * 
 * 方式1： 继承Thread类实现
 * 
 * 这种方式容器产生同步问题
 * 
 * @author 青春常驻Dax1n
 *
 */
public class SellTicketThread extends Thread {
	 
	
	
	public SellTicketThread() {
	}

	public SellTicketThread(String name) {
		super(name);
	}

	// 但是最好使用Runnable实现，静态方法的锁对象是类的字节码文件  其实就是class文件
	private static int ticketNums = 100;// 线程共享的变量，用static修饰

	@Override
	public void run() {

		while (true) {

			synchronized (SellTicketThread.class) {//不加同步代码块就会出现代码同步问题
				
				if (ticketNums > 0) {
					System.out.println(Thread.currentThread().getName() + "正在出售第"
							+ ticketNums-- + "张票...");
					try {
						/**
						 * 相同的票卖了多次
						 * 
						 * 窗口2正在出售第88张票...
						 * 窗口1正在出售第88张票...
						 * 
						 * 出现负的票
						 * 
						 * 出现不同步的原因：
						 * 			对共享的资源不是原子性的操作，例如线程1在操作共享资源的时候线程2也在操作的话，就会出现不同步的问题
						 * 
						 */
						Thread.sleep(1000);//模拟延迟，会出现同步问题
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					break;
				}
			}
			
		}

	}

	public static void main(String[] args) {

		SellTicketThread st1 = new SellTicketThread("窗口1");
		SellTicketThread st2 = new SellTicketThread("窗口2");
		SellTicketThread st3 = new SellTicketThread("窗口3");

		st1.start();
		st2.start();
		st3.start();

	}

}
