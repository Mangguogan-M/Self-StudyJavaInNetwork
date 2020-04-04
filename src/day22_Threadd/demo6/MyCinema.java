package day22_Threadd.demo6;

public class MyCinema implements Runnable {

	int poll = 100;
	Object obj = new Object();

	@Override
	public void run() {
		while (true) {
			// synchronized (obj) {
			// synchronized (this) { ��ͬ�� ͬ������
			// synchronized (MyCinema.class) { ��ͬ�ھ�̬ͬ������
			show();
			// }
		}
	}

	// ͬ���������ǰ�ͬ���ؼ��ּӵ�������
	// ͬ��������������˭ ���������this
	// ��̬������������˭ MyCinema.class
	public synchronized void show() {
		if (poll > 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + (poll--) + "��Ʊ");
		}
	}
}
