package day26_JDK8.demo1;

public class TestInterface {
	public static void main(String[] args) {
		// static方法必须通过接口类调用
		JDK8BeforeInteface.staticMethod();

		// default方法必须通过实现类的对象调用
		new JDK8BeforeIntefaceImpl().defaultMethod();
	}
}
