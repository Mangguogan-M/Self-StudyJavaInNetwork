package day22_Threadd.demo4;

public class TestMyRunnable {
	public static void main(String[] args) {

		// �����̶߳���
		MyRunnable my = new MyRunnable();

		// �����߳�
		Thread t1 = new Thread(my, "�߳�1");
		Thread t2 = new Thread(my, "�߳�2");

		// �����ڲ���ķ�ʽ
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					System.out.println(Thread.currentThread().getName() + " " + i);
				}
			}
		}, "�߳�3").start();

		t1.start();
		t2.start();

	}
}
