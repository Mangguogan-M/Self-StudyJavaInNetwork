package day10;

public class TestSubObject extends TestSuperObject {

	{
		System.out.println("TestSubObject类的构造块");// 2 e
	}

	public TestSubObject() {
		System.out.println("TestSubObject()");// 3 f
	}

	static {
		System.out.println("TestSubObject类中的静态语句块");// 1 b
	}

	public static void main(String[] args) {
		TestSubObject ts = new TestSubObject();
	}

}
