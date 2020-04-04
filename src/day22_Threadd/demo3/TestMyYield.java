package day22_Threadd.demo3;

/*
 * 线程礼让  \ 线程让步
	public static void yield()      放在线程体中操作
	暂停当前正在执行的线程对象（及放弃当前拥有的cup资源），并执行其他线程。让多个线程的执行更和谐，但是不能靠他保证一人一次。
 */
public class TestMyYield {
	public static void main(String[] args) {
		MyYield my1 = new MyYield();
		MyYield my2 = new MyYield();

		my1.setName("刘备");
		my2.setName("关羽");

		my1.start();
		my2.start();

	}
}
