package day26_JDK8.demo3;

/*public class TestFunction1 {
	
	public static void main(String[] args) {
		Call c = new Call() {
			
			@Override
			public void applay(int i) {
				System.out.println(i);
			}
		};
		c.applay(8);
	}
}
interface Call{
	void applay(int i);
}*/
//函数式接口其实是为了lambda表达式而定义的
//函数式接口完全就是为了实现lambda表达式而提出的
public class TestFunction1 {
	public static void main(String[] args) {
		Call c = x -> System.out.println(x);
		c.applay(8);
	}
}

// 正确的函数式接口
@FunctionalInterface
interface Call {
	// 抽象方法
	void applay(int i);

	// static 不是抽象方法
	public static void staticMethod() {

	}

	// default不是抽象方法
	public default void defaultMethod() {

	}

	// java.lang.Object中的方法不是抽象方法
	public boolean equals(Object obj);

}