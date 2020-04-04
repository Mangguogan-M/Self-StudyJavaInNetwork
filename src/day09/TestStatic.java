package day09;

/*
 * 编程观察一下有static修饰和没有static修饰的区别
 */
public class TestStatic {

	private int ot = 1;// 隶属于对象层级，每个对象都拥有独立的一份
	private static int cot = 3;// 隶属于类层级的，所有对象共享同一份

	public void show() {// 隶属于对象层级，使用对象.方式访问
		System.out.println("ot = " + this.ot);
		System.out.println("cot = " + this.cot);
	}

	public static void test() {// 隶属于类层级，使用类名.的方式访问
		// System.out.println("ot = "+ot); error
		System.out.println("cot = " + cot);

	}

	public static void main(String[] args) {
		TestStatic ts = new TestStatic();
		ts.show();

		// 类名.
		// 调用静态方法或者静态变量
		TestStatic.test();
	}

}
