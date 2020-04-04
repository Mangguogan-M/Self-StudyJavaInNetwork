package day22_Threadd.demo9;

/*
 * 生产者
 */
public class Production implements Runnable {

	private Book book;

	private int num = 0;

	public Production(Book book) {
		this.book = book;
	}

	@Override
	public void run() {
		// 为了模拟一直生产
		while (true) {
			synchronized (book) {
				if (book.flag) {
					try {
						book.wait();// 如果有书，生产者线程等待，就不生产了
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				if (num % 2 == 0) {
					book.setName("金苹果");
					book.setRmb("100");
				} else {
					book.setName("银苹果");
					book.setRmb("198");
				}

				num++;

				book.flag = true;
				book.notify();// 唤醒消费者线程

			}
		}
	}

}
