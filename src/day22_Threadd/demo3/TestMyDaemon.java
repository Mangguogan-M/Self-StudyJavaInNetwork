package day22_Threadd.demo3;

/*
 * ��̨�߳�  |
	public final void setDaemon(boolean on)   
	��ָ���̱߳��Ϊ�ػ��̻߳��û��̡߳����������е��̶߳����ػ��߳�ʱ��Java ������˳����÷��������������߳�ǰ���á�
 */
public class TestMyDaemon {
	public static void main(String[] args) {
		MyDaemon my1 = new MyDaemon();
		MyDaemon my2 = new MyDaemon();

		my1.setName("С��");
		my2.setName("С��");

		// �����ػ��߳�
		my1.setDaemon(true);
		my2.setDaemon(true);

		my1.start();
		my2.start();

		Thread.currentThread().setName("С��");
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}

	}
}
