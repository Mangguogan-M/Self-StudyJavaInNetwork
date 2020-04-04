package day22_Threadd.demo5;

public class MyCinema extends Thread {

	static int poll = 100;
	static Object obj = new Object();

	@Override
	public void run() {
		// static int poll = 100; //每个人手里都有100张票

		// 为了演示一直买票
		while (true) {
			// 同步代码块的对象可以是哪些呢?
			synchronized (obj) {
				// m1，m2,m3
				// poll = 100;
				if (poll > 0) {
					try {
						sleep(100);// m1就休息一下,m2也休息一下
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(getName() + "正在出售第" + (poll--) + "张票");
					// 理想状态：
					// 窗口1正在出售第100张票
					// 窗口2正在出售第99张票
					// 但是呢？
					// CPU的每一次执行必须是一个原子性的操纵
					// 先记录以前的值
					// 接着把poll--
					// 然后输出以前的值(m2来了)
					// poll的值就变成了99
					// 线程1正在出售第100张票
					// 线程2正在出售100张票
				}

			}
		}

	}
}
