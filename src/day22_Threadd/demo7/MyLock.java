package day22_Threadd.demo7;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * ��Ȼ���ǿ������ͬ��������ͬ�����������������⣬�������ǲ�û��ֱ�ӿ������������������
 * �������ͷ�������Ϊ�˸������ı����μ������ͷ�����JDK5�Ժ��ṩ��һ���µ�������Lock
		Lock �ӿ�
			void lock()
			void unlock()
		ReentrantLock ��

 */
public class MyLock implements Runnable {
	int poll = 100;
	Object obj = new Object();

	// ����lock��
	Lock lock = new ReentrantLock();

	@Override
	public void run() {
		while (true) {
			// synchronized (MyLock.class) {
			// ����
			lock.lock();
			if (poll > 0) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + (poll--) + "��Ʊ");
			}
			// �ͷ���
			lock.unlock();
			// }
		}
	}
}
