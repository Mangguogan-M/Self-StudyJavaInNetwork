package day22_Threadd.demo6;

public class MyCinema implements Runnable {

	int poll = 100;
	Object obj = new Object();

	@Override
	public void run() {
		while (true) {
			// synchronized (obj) {
			// synchronized (this) { 等同于 同步方法
			// synchronized (MyCinema.class) { 等同于静态同步方法
			show();
			// }
		}
	}

	// 同步方法就是把同步关键字加到方法上
	// 同步方法锁对象是谁 锁对象就是this
	// 静态方法锁对象是谁 MyCinema.class
	public synchronized void show() {
		if (poll > 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "正在出售第" + (poll--) + "张票");
		}
	}
}
