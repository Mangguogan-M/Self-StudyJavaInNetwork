package day08;

/*
 * ��������й۲�this�ؼ���
 */
public class TestThis {

	String name;

	int age;

	TestThis() {
		// �ڹ��췽����this����ǰ���ڹ����Ķ���
		System.out.println("�޲ι�����" + this);

	}

	TestThis(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void show() {
		// �ڳ�Ա������this���뵱ǰ���ڵ��õĶ���
		System.out.println("show������" + this);
	}

	void show2() {
		System.out.println(name + "  " + age);
	}

	public static void main(String[] args) {
		TestThis tt = new TestThis();
		tt.show();
		System.out.println(tt);

		System.out.println("--------------------");
		TestThis tt2 = new TestThis("������", 18);
		tt2.show2();

	}

}
