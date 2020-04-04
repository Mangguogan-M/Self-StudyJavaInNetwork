package day22_Threadd.demo11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 	�̳߳غô����̳߳����ÿһ���̴߳�������󣬲����������������ٴλص��̳߳��г�Ϊ����״̬���ȴ���һ��������ʹ�á�
 * 	
 * 	
 * 		���ʵ���̵߳Ĵ����أ�
 * 			1.�����̳߳ض��󣬿���Ҫ���������̶߳���
 * 				public static ExecutorService newFixedThreadPool(int nThreads)
 *			2.�̳߳ص��߳̿���ִ��
 *				����ִ��Runnable�������Callable���������߳�
 *			3.�������·�����
 *				Future<?> submit(Runnable task)
				<T> Future<T> submit(Callable<T> task)
 * 
 */
public class ExecutorsDemo {
	public static void main(String[] args) {
		// �����̳߳ض��󣬿���Ҫ���������̶߳���
		ExecutorService pool = Executors.newFixedThreadPool(2);

		pool.submit(new MyRunnable());
		pool.submit(new MyRunnable());

		// shutdown() ����һ��˳��رգ�ִ����ǰ�ύ�����񣬵�������������
		// �����̳߳�
		pool.shutdown();

	}
}
