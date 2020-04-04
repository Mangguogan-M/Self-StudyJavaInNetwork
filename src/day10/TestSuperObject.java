package day10;

public class TestSuperObject {

	{
		System.out.println("TestSuperObject类中的构造块");// 2 c
	}

	public TestSuperObject() {
		System.out.println("TestSuperObject()");// 3 d
	}

	static {
		System.out.println("TestSuperObject类中的静态语句块");// 1 a
	}

	public static void main(String[] args) {
		TestSuperObject ts = new TestSuperObject();
	}
}
