package day10;

public class TestSubObject extends TestSuperObject {

	{
		System.out.println("TestSubObject��Ĺ����");// 2 e
	}

	public TestSubObject() {
		System.out.println("TestSubObject()");// 3 f
	}

	static {
		System.out.println("TestSubObject���еľ�̬����");// 1 b
	}

	public static void main(String[] args) {
		TestSubObject ts = new TestSubObject();
	}

}
