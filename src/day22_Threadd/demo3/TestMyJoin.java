package day22_Threadd.demo3;

/*
 * �̼߳���  	\  join�߳�           ����start()���������
public final void join()  �ȴ��߳���ֹ���ż���ִ���¸�
 */
public class TestMyJoin {
	public static void main(String[] args) {

		MyJoin my1 = new MyJoin();
		MyJoin my2 = new MyJoin();
		MyJoin my3 = new MyJoin();

		my1.setName("С��");
		my2.setName("С��");
		my3.setName("С��");

		my1.start();
		try {
			my1.join();// ���߳�1ִ�н���֮�������̲߳���ִ��
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		my2.start();
		my3.start();

	}
}
