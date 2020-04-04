package day24_Annotation.demo2;

import org.junit.Test;

public class TestAnnotation {

	// 标记注解 只起到标记作用
	/*
	 * @Description public void method1(){ }
	 */

	// 完全注解 多个值
	/*
	 * @Description(author="xxx",desc="asc",age=19) public void method2(){ }
	 */

	// 单值注解 里面只有一个值
	/*
	 * @Description("三") public void method3(){ }
	 */

	@Test
	public void test() {
		System.out.println("111111111111111");
	}

	@Test
	public void test2() {
		System.out.println("222222");
	}
}
