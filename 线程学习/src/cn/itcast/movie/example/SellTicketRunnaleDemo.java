package cn.itcast.movie.example;
/**
 * ͬ�����������������ʹ����������
 * 
 * 
 * 
 * ͬ����������������this�����ͬ��������ͬ������һ��ʹ�õĻ�����ͬ������������������Ϊthis
 * 
 * 
 * 
 * 
 * ��̬��Ա�������󣺸����.class�ļ�
 * 
 * 
 * @author �ഺ��פDax1n
 *
 */
class SellTicketRunnale implements Runnable {

	private int ticketNums = 100;

	//ͬ�����������������ʹ����������
	private Object obj = new Object();

	@Override
	public void run() {

		while (true) {
			synchronized (obj) {
				if (ticketNums > 0) {
					System.out.println(Thread.currentThread().getName()
							+ "���ڳ��۵�" + ticketNums-- + "��Ʊ...");
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
		Thread t1 = new Thread(st, "����1");
		Thread t2 = new Thread(st, "����2");
		Thread t3 = new Thread(st, "����3");

		t1.start();
		t2.start();
		t3.start();
	}
}
