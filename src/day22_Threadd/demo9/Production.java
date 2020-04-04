package day22_Threadd.demo9;

/*
 * ������
 */
public class Production implements Runnable {

	private Book book;

	private int num = 0;

	public Production(Book book) {
		this.book = book;
	}

	@Override
	public void run() {
		// Ϊ��ģ��һֱ����
		while (true) {
			synchronized (book) {
				if (book.flag) {
					try {
						book.wait();// ������飬�������̵߳ȴ����Ͳ�������
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				if (num % 2 == 0) {
					book.setName("��ƻ��");
					book.setRmb("100");
				} else {
					book.setName("��ƻ��");
					book.setRmb("198");
				}

				num++;

				book.flag = true;
				book.notify();// �����������߳�

			}
		}
	}

}
