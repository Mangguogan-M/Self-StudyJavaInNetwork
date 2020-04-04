package day22_Threadd.demo3;

/*
 * 线程加入  	\  join线程           放在start()方法后调用
public final void join()  等待线程终止，才继续执行下个
 */
public class TestMyJoin {
	public static void main(String[] args) {

		MyJoin my1 = new MyJoin();
		MyJoin my2 = new MyJoin();
		MyJoin my3 = new MyJoin();

		my1.setName("小红");
		my2.setName("小明");
		my3.setName("小王");

		my1.start();
		try {
			my1.join();// 当线程1执行结束之后后面的线程才能执行
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		my2.start();
		my3.start();

	}
}
