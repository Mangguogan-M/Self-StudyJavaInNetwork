package day12.inner.demo2;

//演示局部内部类
public class Outer {// 外部类

	private String str1 = "Outer类中的str1";
	private String str2 = "Outer类中的str2";

	// 定义一个外部类方法
	public void print() {
		System.out.println("Outer类中的print方法");
	}

	static {
		class d {
		} // 局部内部类
	}

	public void method() {

		// 必须在使用之前定义
		class Inner {
			private String str1 = "Inner类中的str1";

			// 内部类成员优先于外部类成员
			public void visitOuter() {
				System.out.println(str1);
				System.out.println(str2);
				print();// 直接跳到外部类方法
			}

		}

		// 局部内部类只能在定义它的方法或代码块中使用
		// 只能使用abstract\final修饰 不能与外部类重名
		Inner in = new Inner();
		in.visitOuter();
	}

}
