package day12.inner.demo3;

public class Outer {// 外部类

	private String str1 = "Outer类中的str1";
	private String str2 = "Outer类中的str2";

	// 匿名内部类
	InterDemo id = new InterDemo() {

		private String str1 = "匿名内部类的str1";

		@Override
		public void print() {
			System.out.println(str1);
			System.out.println(str2);

			// 如果想要去调用外部类的变量 外部类.this.变量名
			System.out.println(Outer.this.str1);

		}
	};

	public void show() {
		id.print();
	}

}
