package day22_Threadd.demo2;

/*
 * 8.设置和获取线程优先级
public final int getPriority()
public final void setPriority(int newPriority)

		线程执行随机型的，并不是你优先级越大就一定先执行。
 */
public class TestMyPriority {
	public static void main(String[] args) {

		// 1.创建线程1对象
		MyPriority my1 = new MyPriority("线程1");
		// 2.创建线程2对象
		MyPriority my2 = new MyPriority("线程2");

		// 设置线程优先级 在线程启动前进行设置
		/// my1.setPriority(1000);//java.lang.IllegalArgumentException 非法参数异常
		/*
		 * 线程优先级：最大10 最小1 默认5
		 */
		my1.setPriority(10);
		my2.setPriority(1);

		// 启动线程
		my1.start();
		my2.start();
	}
}
