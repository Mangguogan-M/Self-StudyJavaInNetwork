package day10;

public class TestSuperObject {

	{
		System.out.println("TestSuperObject���еĹ����");// 2 c
	}

	public TestSuperObject() {
		System.out.println("TestSuperObject()");// 3 d
	}

	static {
		System.out.println("TestSuperObject���еľ�̬����");// 1 a
	}

	public static void main(String[] args) {
		TestSuperObject ts = new TestSuperObject();
	}
}
