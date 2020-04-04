package day22_Threadd.demo3;

public class MyYield extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName() + " " + i);
			Thread.yield();// ÀñÈÃ
		}

	}

}
