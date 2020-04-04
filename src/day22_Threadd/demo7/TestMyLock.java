package day22_Threadd.demo7;

public class TestMyLock {
	public static void main(String[] args) {

		MyLock m1 = new MyLock();
		Thread t1 = new Thread(m1, "线程1");
		Thread t2 = new Thread(m1, "线程2");
		Thread t3 = new Thread(m1, "线程3");

		t1.start();
		t2.start();
		t3.start();

	}
}
