package day26_JDK8.demo3;

/*
 * ʹ��Lambda���ʽ��ʵ��Runnable�ӿڵ�ʵ��
 */
public class TestLambdaThread {
	public static void main(String[] args) {

		// 1.ʹ�������ڲ���
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("hello world");
			}
		}).start();

		// 2.ʹ��lambda
		new Thread(() -> System.out.println("Hello world")).start();

		// 3.ʹ�������ڲ���
		Runnable run = new Runnable() {

			@Override
			public void run() {
				System.out.println("hello world");
			}
		};

		// ʹ��lambda
		Runnable run2 = () -> System.out.println("hello world");

		// ֱ�ӵ���run������û�����̣߳�
		run.run();
		run2.run();

	}
}
