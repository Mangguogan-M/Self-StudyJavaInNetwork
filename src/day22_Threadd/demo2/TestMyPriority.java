package day22_Threadd.demo2;

/*
 * 8.���úͻ�ȡ�߳����ȼ�
public final int getPriority()
public final void setPriority(int newPriority)

		�߳�ִ������͵ģ������������ȼ�Խ���һ����ִ�С�
 */
public class TestMyPriority {
	public static void main(String[] args) {

		// 1.�����߳�1����
		MyPriority my1 = new MyPriority("�߳�1");
		// 2.�����߳�2����
		MyPriority my2 = new MyPriority("�߳�2");

		// �����߳����ȼ� ���߳�����ǰ��������
		/// my1.setPriority(1000);//java.lang.IllegalArgumentException �Ƿ������쳣
		/*
		 * �߳����ȼ������10 ��С1 Ĭ��5
		 */
		my1.setPriority(10);
		my2.setPriority(1);

		// �����߳�
		my1.start();
		my2.start();
	}
}
