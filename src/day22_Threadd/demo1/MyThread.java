package day22_Threadd.demo1;

/*
 * run���������װ���Ǳ��߳�ִ�еĴ���
 */
public class MyThread extends Thread {

	public MyThread() {

	}

	public MyThread(String name) {
		// �ڶ��ָ��߳��������ƣ�ͨ��Thread������߳���������
		super(name);
	}

	@Override
	public void run() {
		// System.out.println("��ö��߳�");
		// һ����˵�����߳�ִ�еĴ���һ���ȽϺ�ʱ��
		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + " " + i);
		}
	}

}
