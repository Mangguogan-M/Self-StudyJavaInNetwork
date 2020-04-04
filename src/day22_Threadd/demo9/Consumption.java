package day22_Threadd.demo9;

/*
 * 消费者
 */
public class Consumption implements Runnable {

	private Book book;

	public Consumption(Book book) {
		this.book = book;
	}

	@Override
	public void run() {

		// 为了模拟一直消费
		while (true) {

			synchronized (book) {
				if (!book.flag) {
					try {
						book.wait();// 等待，如果生产这通知有书就接着往下走
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
