package day12.inner.demo1;

import day12.inner.demo1.Outer.Inner;

public class TestOuter {
	public static void main(String[] args) {
		// 如果要创建内部类，那么在此之前需要先创建外部类对象

		// 创建外部类对象
		Outer o = new Outer();

		// 创建内部类
		Inner inner = o.new Inner();
		inner.show();

	}
}
