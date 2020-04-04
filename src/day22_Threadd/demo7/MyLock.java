package day22_Threadd.demo7;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 虽然我们可以理解同步代码块和同步方法的锁对象问题，但是我们并没有直接看到在哪里加上了锁，
 * 在哪里释放了锁，为了更清晰的表达如何加锁和释放锁，JDK5以后提供了一个新的锁对象Lock
		Lock 接口
			void lock()
			void unlock()
		ReentrantLock 类

 */
public class MyLock implements Runnable {
	int poll = 100;
	Object obj = new Object();

	// 声明lock锁
	Lock lock = new ReentrantLock();

	@Override
	public void run() {
		while (true) {
			// synchronized (MyLock.class) {
			// 加锁
			lock.lock();
			if (poll > 0) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "正在出售第" + (poll--) + "张票");
			}
			// 释放锁
			lock.unlock();
			// }
		}
	}
}
