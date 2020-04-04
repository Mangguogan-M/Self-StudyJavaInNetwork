package day22_Threadd.demo1;

/*
 * 实现多线程程序
 * 			由于线程是依赖于进程存在的，首先先要创建一个进程出来。
 * 			而进程是由系统进行创建，所以需要调用系统功能创建一个进程。
 * 			但是Java是不能调用系统功能的，所以，我们没有办法实现多线程程序。
 * 			但是？Java可以调用C/C++写好的程序来实现多线程程序。
 * 			有C/C++去调用系统功能创建进程，由Java去调用这东东，
 * 			给我们提供一些类共我们使用(API),我们就可以实现多线程了。
 * 
 * Java中提供的类：
 * 		Thread
 * 		两种实现多线程方式
 * 
 * 方式一：
 * 		继承Thread类
 * 
 * 		步骤：
 * 			1.自定义类MyThread 继承Thread类
 * 			2.MyThread重写run方法
 * 				为什么重写run方法
 * 			3.创建对象
 * 			4.启动线程
 */
public class MyThreadDemo {
	public static void main(String[] args) {

		// 创建线程对象
		// MyThread my = new MyThread();

		// 启动线程
		// my.run();
		// my.run();
		// 为什么调用run方法是单线程呢？
		// 因为run方法直接调用其实就是相当于普通方法调用，所以你看到的效果就是单线程的效果。
		// 如果想要看多线程效果，就必须使用start()
		// 面试题 run()和start()区别
		// start()方法首先启动线程，然后由jvm去调用该线程的run方法。
		// run()方法仅仅是封装被线程执行的代码，直接调用就是普通方法
		// java.lang.IllegalThreadStateException 非法线程状态异常
		// 为什么？因为这个相当于是my线程被调用了两次，而不是两个线程启动
		// my.start();
		// my.start();

		// 创建两个线程对象
		MyThread my1 = new MyThread();
		// 方式一设置线程名称
		my1.setName("线程1");
		MyThread my2 = new MyThread("线程2");

		my1.start();
		my2.start();

		// 如何获取main方法所在的线程名称呢?
		Thread.currentThread().setName("主线程");
		// public static Thread currentThread() 返回当前正在执行线程对象
		System.out.println(Thread.currentThread().getName());

	}
}
