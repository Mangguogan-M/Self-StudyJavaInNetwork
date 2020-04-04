package day22_Threadd.demo4;

public class TestMyRunnable {
	public static void main(String[] args) {

		// 创建线程对象
		MyRunnable my = new MyRunnable();

		// 创建线程
		Thread t1 = new Thread(my, "线程1");
		Thread t2 = new Thread(my, "线程2");

		// 匿名内部类的方式
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					System.out.println(Thread.currentThread().getName() + " " + i);
				}
			}
		}, "线程3").start();

		t1.start();
		t2.start();

	}
}
