package day22_Threadd.demo2;

public class MyPriority extends Thread {

	public MyPriority(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(getName() + " " + i);
		}
	}
}
