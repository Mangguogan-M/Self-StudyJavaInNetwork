package day22_Threadd.demo9;

/*
 * ������
 */
public class Consumption implements Runnable {

	private Book book;

	public Consumption(Book book) {
		this.book = book;
	}

	@Override
	public void run() {

		// Ϊ��ģ��һֱ����
		while (true) {

			synchronized (book) {
				if (!book.flag) {
					try {
						book.wait();// �ȴ������������֪ͨ����ͽ���������
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(book.getName() + " " + book.getRmb());
				book.flag = false;
				book.notify();

			}

		}

	}

}
