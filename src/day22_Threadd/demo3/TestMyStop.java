package day22_Threadd.demo3;

/*
 * �ж��߳�
		public final void stop()   ���߳�ֹͣ����ʱ�ˣ����ǻ�����ʹ�á�
		public void interrupt()  �ж��̡߳� ���̵߳�״̬��ֹ�����׳�һ��InterruptedException��

 */
public class TestMyStop {
	public static void main(String[] args) throws InterruptedException {
		MyStop m1 = new MyStop();
		MyStop m2 = new MyStop();
		m1.setName("����");
		m2.setName("����");
		Thread.sleep(1200);
		m1.start();
		// m1.stop();//��ֹ�߳�
		m1.interrupt();
		m2.start();

	}
}
