package day26_JDK8.demo1;

/*
 * JDK8之前，接口中可以定义变量和方法，变量必须是public 、static、final的
 * 方法必须是public 、 abstract的
 * 
 * JDK8后，允许在接口中定义static方法和default方法
 */
public interface JDK8BeforeInteface {

	// static 修饰符定义静态方法
	static void staticMethod() {
		System.out.println("接口中的静态方法");
	}

	// default 修饰符定义默认方法
	default void defaultMethod() {
		System.out.println("接口中的默认方法");
	}

}
