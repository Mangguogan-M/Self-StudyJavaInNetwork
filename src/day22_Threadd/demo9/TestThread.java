package day22_Threadd.demo9;

/*
 * ������
 * 		�ȿ��Ƿ������ݣ��о͵ȴ���û�о����ɣ��������֮��֪ͨ������������
 * 	������
 * 		�ȿ��Ƿ������ݣ��о����ѣ�û�о͵ȴ���֪ͨ������������Ʒ
 * 
 * 	Java�ṩһ�ֵȴ����ѻ���
 * 		
 * 		�ȴ�����
 * 			wait()�ȴ�
 * 			notify()���ѵ����߳�
 * 			notifyAll()�������еȴ����߳�
 * 
 * 
 * 			wait��sleep����
 * 				wait�ȴ���Ҫ������
 * 				sleep���ߣ�һ��ʱ����Զ�����
 */
public class TestThread {
	public static void main(String[] args) {
		Book book = new Book();
		Production p = new Production(book);

		Consumption c = new Consumption(book);

		Thread t1 = new Thread(p);

		Thread t2 = new Thread(c);

		t1.start();
		t2.start();

	}
}
