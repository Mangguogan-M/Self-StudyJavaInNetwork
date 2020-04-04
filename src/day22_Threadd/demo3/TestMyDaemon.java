package day22_Threadd.demo3;

/*
 * 后台线程  |
	public final void setDaemon(boolean on)   
	将指定线程标记为守护线程或用户线程。当正在运行的线程都是守护线程时，Java 虚拟机退出。该方法必须在启动线程前调用。
 */
public class TestMyDaemon {
	public static void main(String[] args) {
		MyDaemon my1 = new MyDaemon();
		MyDaemon my2 = new MyDaemon();

		my1.setName("小明");
		my2.setName("小王");

		// 设置守护线程
		my1.setDaemon(true);
		my2.setDaemon(true);

		my1.start();
		my2.start();

		Thread.currentThread().setName("小苍");
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}

	}
}
