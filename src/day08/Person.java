package day08;

/*
 * ����Person ��
 */
public class Person {
	// ��Ա����
	String name;
	int age;

	// �Զ����޲εĹ���
	Person() {
		System.out.println("�Ҿ���һ���޲ι��췽����������ս.");
		name = "����";
		age = 18;
	}

	// �Զ����вεĹ��췽�����ܹ�����������������Ϊ����
	Person(String n, int a) {
		name = n;
		age = a;
	}

	// �Զ����Ա����ʵ������������Ĵ�ӡ
	void show() {
		System.out.println("����" + name + ",����" + age + "����.");
	}

	public static void main(String[] args) {
		Person p = new Person();
		p.show();
		System.out.println("-----------------");
		// ��ʾ�ִ�����һ�����󣬲�����ַ��¼��p2��
		Person p2 = new Person("�ŷ�", 20);
		p2.show();
	}
}
