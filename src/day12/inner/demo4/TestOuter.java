package day12.inner.demo4;

import day12.inner.demo4.Outer.Inner;

public class TestOuter {
	public static void main(String[] args) {

		// 如果创建内部类或者静态嵌套类对象
		// 首先创建外部类的对象
		Inner inner = new Outer.Inner();

		inner.show();

	}
}
