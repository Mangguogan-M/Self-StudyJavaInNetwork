package day22_Threadd.demo1;

/*
 * ʵ�ֶ��̳߳���
 * 			�����߳��������ڽ��̴��ڵģ�������Ҫ����һ�����̳�����
 * 			����������ϵͳ���д�����������Ҫ����ϵͳ���ܴ���һ�����̡�
 * 			����Java�ǲ��ܵ���ϵͳ���ܵģ����ԣ�����û�а취ʵ�ֶ��̳߳���
 * 			���ǣ�Java���Ե���C/C++д�õĳ�����ʵ�ֶ��̳߳���
 * 			��C/C++ȥ����ϵͳ���ܴ������̣���Javaȥ�����ⶫ����
 * 			�������ṩһЩ�๲����ʹ��(API),���ǾͿ���ʵ�ֶ��߳��ˡ�
 * 
 * Java���ṩ���ࣺ
 * 		Thread
 * 		����ʵ�ֶ��̷߳�ʽ
 * 
 * ��ʽһ��
 * 		�̳�Thread��
 * 
 * 		���裺
 * 			1.�Զ�����MyThread �̳�Thread��
 * 			2.MyThread��дrun����
 * 				Ϊʲô��дrun����
 * 			3.��������
 * 			4.�����߳�
 */
public class MyThreadDemo {
	public static void main(String[] args) {

		// �����̶߳���
		// MyThread my = new MyThread();

		// �����߳�
		// my.run();
		// my.run();
		// Ϊʲô����run�����ǵ��߳��أ�
		// ��Ϊrun����ֱ�ӵ�����ʵ�����൱����ͨ�������ã������㿴����Ч�����ǵ��̵߳�Ч����
		// �����Ҫ�����߳�Ч�����ͱ���ʹ��start()
		// ������ run()��start()����
		// start()�������������̣߳�Ȼ����jvmȥ���ø��̵߳�run������
		// run()���������Ƿ�װ���߳�ִ�еĴ��룬ֱ�ӵ��þ�����ͨ����
		// java.lang.IllegalThreadStateException �Ƿ��߳�״̬�쳣
		// Ϊʲô����Ϊ����൱����my�̱߳����������Σ������������߳�����
		// my.start();
		// my.start();

		// ���������̶߳���
		MyThread my1 = new MyThread();
		// ��ʽһ�����߳�����
		my1.setName("�߳�1");
		MyThread my2 = new MyThread("�߳�2");

		my1.start();
		my2.start();

		// ��λ�ȡmain�������ڵ��߳�������?
		Thread.currentThread().setName("���߳�");
		// public static Thread currentThread() ���ص�ǰ����ִ���̶߳���
		System.out.println(Thread.currentThread().getName());

	}
}
