package day22_Threadd.demo3;

public class MyStop extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(getName() + " " + i);
		}
	}

}
