package day22_Threadd.demo1;

/*
 * run方法里面封装的是被线程执行的代码
 */
public class MyThread extends Thread {

	public MyThread() {

	}

	public MyThread(String name) {
		// 第二种给线程设置名称，通过Thread构造给线程设置名称
		super(name);
	}

	@Override
	public void run() {
		// System.out.println("你好多线程");
		// 一般来说，被线程执行的代码一定比较耗时。
		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + " " + i);
		}
	}

}
