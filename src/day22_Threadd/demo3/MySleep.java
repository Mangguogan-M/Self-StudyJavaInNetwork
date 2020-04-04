package day22_Threadd.demo3;

public class MySleep extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			// Ë¯Ãß
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(getName() + "  " + i);
		}
	}

}
