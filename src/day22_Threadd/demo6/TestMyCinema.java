package day22_Threadd.demo6;

/*
 * 
		某电影院目前正在上映喜剧大片，共有100张票，而它有3个售票窗口售票，请设计一个程序模拟该电影院售票。
		
		
		问题：
			出现相同票数
			出现负票
			
			
			同步代码块
				格式：
					synchronized(对象){需要同步的代码;}
				同步可以解决安全问题的根本原因就在那个对象上。该对象如同锁的功能。
				通过同步代码块解决线程安全问题
 */
public class TestMyCinema {
	public static void main(String[] args) {

		MyCinema m1 = new MyCinema();
		Thread t1 = new Thread(m1, "线程1");
		Thread t2 = new Thread(m1, "线程2");
		Thread t3 = new Thread(m1, "线程3");

		t1.start();
		t2.start();
		t3.start();

	}
}
