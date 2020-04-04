package day22_Threadd.demo3;

/*
 * 中断线程
		public final void stop()   让线程停止，过时了，但是还可以使用。
		public void interrupt()  中断线程。 把线程的状态终止，并抛出一个InterruptedException。

 */
public class TestMyStop {
	public static void main(String[] args) throws InterruptedException {
		MyStop m1 = new MyStop();
		MyStop m2 = new MyStop();
		m1.setName("马云");
		m2.setName("马花藤");
		Thread.sleep(1200);
		m1.start();
		// m1.stop();//终止线程
		m1.interrupt();
		m2.start();

	}
}
