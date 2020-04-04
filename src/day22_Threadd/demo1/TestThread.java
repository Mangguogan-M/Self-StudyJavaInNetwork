package day22_Threadd.demo1;

/*
 * 演示：下列程序是单线程还是多线程？
 * 		
 * 		下列案例属于单线程程序，只有一条执行路径
 * 
 */
public class TestThread {
	public static void main(String[] args) {
		show();
	}

	private static void show() {
		method1();
		method2();
	}

	private static void method2() {
		System.out.println("method2方法");
	}

	private static void method1() {
		System.out.println("method1方法");
	}
}
