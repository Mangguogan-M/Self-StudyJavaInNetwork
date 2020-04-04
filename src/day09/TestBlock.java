package day09;

/*
 * 编程实现构造块和静态语句块的使用
 */
public class TestBlock {

	{
		System.out.println("构造块");// （2）
	}

	public TestBlock() {
		System.out.println("构造方法体");// （3）
	}

	static {
		System.out.println("静态语句块");// （1）
	}

	public static void main(String[] args) {
		// 当类加载是 首先先加载static块中的内容
		TestBlock tb = new TestBlock();
	}
}
