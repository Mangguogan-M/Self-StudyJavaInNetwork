package day22_Threadd.demo4;

/*
 * 声明是个线程
 * 		五个线程对变量进行++
 * 		五个线程对变量进行--
 * 
 * 		为什么结果不是0，每次运行都不一样。
 */
public class ThreadCase {

	static int num = 0;

	public static void main(String[] args) {

		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				new Thread(new Runnable() {

					@Override
					public void run() {
						num++;
					}
				}, "线程" + i).start();
			} else {
				new Thread(new Runnable() {

					@Override
					public void run() {
						num--;
					}
				}, "线程" + i).start();
			}
		}
		System.out.println(num);
	}
}
