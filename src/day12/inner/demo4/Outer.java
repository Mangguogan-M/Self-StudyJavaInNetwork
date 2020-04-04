package day12.inner.demo4;

public class Outer {// 外部类

	// 创建两个成员变量 一个静态一个非静态
	private String str1 = "外部类的str1";
	private static String str2 = "外部类的str2";

	// 成员方法 静态
	public static void show1() {
		System.out.println("外部类的show方法");

	}

	// 静态嵌套类
	// 只能定义在类的成员位置，不能定义在方法或代码块中
	public static class Inner {

		private static String str1 = "嵌套类的str2";

		public void show() {
			System.out.println(str2);
			System.out.println(str1);

			// 不能直接访问外部类的非静态成员
			// 可以直接访问外部类的静态成员
			show1();
		}

	}

}
