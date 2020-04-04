package day22_Threadd.demo3;

/*
 * 线程休眠
 * 		public static void sleep(long millis)

 */
public class TestMySleep {
	public static void main(String[] args) {
		MySleep my1 = new MySleep();
		MySleep my2 = new MySleep();
		MySleep my3 = new MySleep();

		my1.setName("张三");
		my2.setName("李四");
		my2.setName("王五");

		my1.start();
		my2.start();
		my3.start();

	}
}
