package day22_Threadd.demo4;

//�ڶ����߳�ʵ�ַ�ʽ ʵ��Runnable�ӿڣ�����̴߳���
public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}

}
