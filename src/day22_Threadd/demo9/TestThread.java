package day22_Threadd.demo9;

/*
 * 生产者
 * 		先看是否有数据，有就等待，没有就生成，生成完成之后通知消费者来消费
 * 	消费者
 * 		先看是否有数据，有就消费，没有就等待，通知生产者生产产品
 * 
 * 	Java提供一种等待唤醒机制
 * 		
 * 		等待唤醒
 * 			wait()等待
 * 			notify()唤醒单个线程
 * 			notifyAll()唤醒所有等待的线程
 * 
 * 
 * 			wait和sleep区别？
 * 				wait等待需要被唤醒
 * 				sleep休眠，一定时间会自动醒来
 */
public class TestThread {
	public static void main(String[] args) {
		Book book = new Book();
		Production p = new Production(book);

		Consumption c = new Consumption(book);

		Thread t1 = new Thread(p);

		Thread t2 = new Thread(c);

		t1.start();
		t2.start();

	}
}
