package day10;

public class TestFinal {
	// final可以修饰成员变量
	// final修饰成员变量表示必须指定初始值不能更改,代表最终变量
	private /* final */ int count = 0;

	public static void main(String[] args) {
		TestFinal tf = new TestFinal();
		System.out.println(tf.count);
		tf.count = 20;

		System.out.println(tf.count);
	}
}
