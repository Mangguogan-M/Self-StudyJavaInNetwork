package day22_Threadd.demo10;

/*
 * 线程组，把多个线程组合到一起
 * 它可以对一批线程进行分类管理，Java允许程序直接对线程进行控制
 */
public class ThreadGroupDemo {
	public static void main(String[] args) {

		// method1();

		// 我们如何修改线程所在的组呢？
		// 创建一个线程组
		// 创建其他线程的时候，把其他线程的组指定为我们新建线程组
		method2();
	}

	private static void method2() {
		// ThreadGroup(String name) 构造一个新线程组。
		ThreadGroup tg = new ThreadGroup("这是一个新的线程组");

		MyRunnable my1 = new MyRunnable();

		// 如果我想指定下列线程属于哪个组，怎么办？
		Thread t1 = new Thread(tg, my1, "线程1");
		Thread t2 = new Thread(tg, my1, "线程2");

		// 线程类中方法：getThreadGroup() 返回该线程所属的线程组。
		ThreadGroup threadGroup = t1.getThreadGroup();
		ThreadGroup threadGroup2 = t2.getThreadGroup();
		// 线程组方法：getName()
		String name = threadGroup.getName();
		String name2 = threadGroup2.getName();
		// 通过结果我们知道，线程默认情况下属于main线程组
		System.out.println(name);
		System.out.println(name2);

		tg.setDaemon(true);// 通过组名称设置后台线程，表示该组的线程都是后台线程

	}

	private static void method1() {
		MyRunnable my1 = new MyRunnable();

		// 如果我想指定下列线程属于哪个组，怎么办？
		Thread t1 = new Thread(my1);
		Thread t2 = new Thread(my1);

		// 线程类中方法：getThreadGroup() 返回该线程所属的线程组。
		ThreadGroup threadGroup = t1.getThreadGroup();
		ThreadGroup threadGroup2 = t2.getThreadGroup();
		// 线程组方法：getName()
		String name = threadGroup.getName();
		String name2 = threadGroup2.getName();
		// 通过结果我们知道，线程默认情况下属于main线程组
		System.out.println(name);
		System.out.println(name2);

		// 默认情况下，所有的线程都属于同一个线程组
		System.out.println(Thread.currentThread().getThreadGroup().getName());

	}
}
