package cn.itcast.movie.example;

/**
 * 
 * ����ӰƱ��100��Ʊ�����������ۡ�
 * 
 * ��ʽ1�� �̳�Thread��ʵ��
 * 
 * ���ַ�ʽ��������ͬ������
 * 
 * @author �ഺ��פDax1n
 *
 */
public class SellTicketThread extends Thread {
	 
	
	
	public SellTicketThread() {
	}

	public SellTicketThread(String name) {
		super(name);
	}

	// �������ʹ��Runnableʵ�֣���̬������������������ֽ����ļ�  ��ʵ����class�ļ�
	private static int ticketNums = 100;// �̹߳���ı�������static����

	@Override
	public void run() {

		while (true) {

			synchronized (SellTicketThread.class) {//����ͬ�������ͻ���ִ���ͬ������
				
				if (ticketNums > 0) {
					System.out.println(Thread.currentThread().getName() + "���ڳ��۵�"
							+ ticketNums-- + "��Ʊ...");
					try {
						/**
						 * ��ͬ��Ʊ���˶��
						 * 
						 * ����2���ڳ��۵�88��Ʊ...
						 * ����1���ڳ��۵�88��Ʊ...
						 * 
						 * ���ָ���Ʊ
						 * 
						 * ���ֲ�ͬ����ԭ��
						 * 			�Թ������Դ����ԭ���ԵĲ����������߳�1�ڲ���������Դ��ʱ���߳�2Ҳ�ڲ����Ļ����ͻ���ֲ�ͬ��������
						 * 
						 */
						Thread.sleep(1000);//ģ���ӳ٣������ͬ������
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

		SellTicketThread st1 = new SellTicketThread("����1");
		SellTicketThread st2 = new SellTicketThread("����2");
		SellTicketThread st3 = new SellTicketThread("����3");

		st1.start();
		st2.start();
		st3.start();

	}

}
