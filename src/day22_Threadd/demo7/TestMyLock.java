package day22_Threadd.demo7;

public class TestMyLock {
	public static void main(String[] args) {

		MyLock m1 = new MyLock();
		Thread t1 = new Thread(m1, "�߳�1");
		Thread t2 = new Thread(m1, "�߳�2");
		Thread t3 = new Thread(m1, "�߳�3");

		t1.start();
		t2.start();
		t3.start();

	}
}
