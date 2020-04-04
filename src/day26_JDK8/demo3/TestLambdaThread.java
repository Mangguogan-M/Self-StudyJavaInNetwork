package day26_JDK8.demo3;

/*
 * 使用Lambda表达式来实现Runnable接口的实例
 */
public class TestLambdaThread {
	public static void main(String[] args) {

		// 1.使用匿名内部类
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("hello world");
			}
		}).start();

		// 2.使用lambda
		new Thread(() -> System.out.println("Hello world")).start();

		// 3.使用匿名内部类
		Runnable run = new Runnable() {

			@Override
			public void run() {
				System.out.println("hello world");
			}
		};

		// 使用lambda
		Runnable run2 = () -> System.out.println("hello world");

		// 直接调用run方法（没开新线程）
		run.run();
		run2.run();

	}
}
