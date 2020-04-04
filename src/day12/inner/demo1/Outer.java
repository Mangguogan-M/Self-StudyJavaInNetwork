package day12.inner.demo1;

//演示成员内部类的使用
public class Outer {// 外部类
	private String str = "Outer类的str1";
	private String str2 = "Outer类的str2";

	/*
	 * 第一：内部类名称不能于外部类重名 第二：可以使用final、方法修饰符修饰
	 */

	public class Inner {// 内部类
		private String str = "Inner类的str1";
		private String str2 = "Inner类的str2";

		public void show() {
			// 内部类的成员优先于外部类成员
			System.out.println(str);
			System.out.println(str2);

			// 使用“外部类名.this.成员”访问外部类的成员
			System.out.println(Outer.this.str2);
		}

	}

}
