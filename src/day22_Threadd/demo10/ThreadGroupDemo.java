package day22_Threadd.demo10;

/*
 * �߳��飬�Ѷ���߳���ϵ�һ��
 * �����Զ�һ���߳̽��з������Java�������ֱ�Ӷ��߳̽��п���
 */
public class ThreadGroupDemo {
	public static void main(String[] args) {

		// method1();

		// ��������޸��߳����ڵ����أ�
		// ����һ���߳���
		// ���������̵߳�ʱ�򣬰������̵߳���ָ��Ϊ�����½��߳���
		method2();
	}

	private static void method2() {
		// ThreadGroup(String name) ����һ�����߳��顣
		ThreadGroup tg = new ThreadGroup("����һ���µ��߳���");

		MyRunnable my1 = new MyRunnable();

		// �������ָ�������߳������ĸ��飬��ô�죿
		Thread t1 = new Thread(tg, my1, "�߳�1");
		Thread t2 = new Thread(tg, my1, "�߳�2");

		// �߳����з�����getThreadGroup() ���ظ��߳��������߳��顣
		ThreadGroup threadGroup = t1.getThreadGroup();
		ThreadGroup threadGroup2 = t2.getThreadGroup();
		// �߳��鷽����getName()
		String name = threadGroup.getName();
		String name2 = threadGroup2.getName();
		// ͨ���������֪�����߳�Ĭ�����������main�߳���
		System.out.println(name);
		System.out.println(name2);

		tg.setDaemon(true);// ͨ�����������ú�̨�̣߳���ʾ������̶߳��Ǻ�̨�߳�

	}

	private static void method1() {
		MyRunnable my1 = new MyRunnable();

		// �������ָ�������߳������ĸ��飬��ô�죿
		Thread t1 = new Thread(my1);
		Thread t2 = new Thread(my1);

		// �߳����з�����getThreadGroup() ���ظ��߳��������߳��顣
		ThreadGroup threadGroup = t1.getThreadGroup();
		ThreadGroup threadGroup2 = t2.getThreadGroup();
		// �߳��鷽����getName()
		String name = threadGroup.getName();
		String name2 = threadGroup2.getName();
		// ͨ���������֪�����߳�Ĭ�����������main�߳���
		System.out.println(name);
		System.out.println(name2);

		// Ĭ������£����е��̶߳�����ͬһ���߳���
		System.out.println(Thread.currentThread().getThreadGroup().getName());

	}
}
