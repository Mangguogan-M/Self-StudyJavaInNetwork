package day24_Annotation.demo2;

import org.junit.Test;

public class TestAnnotation {

	// ���ע�� ֻ�𵽱������
	/*
	 * @Description public void method1(){ }
	 */

	// ��ȫע�� ���ֵ
	/*
	 * @Description(author="xxx",desc="asc",age=19) public void method2(){ }
	 */

	// ��ֵע�� ����ֻ��һ��ֵ
	/*
	 * @Description("��") public void method3(){ }
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
