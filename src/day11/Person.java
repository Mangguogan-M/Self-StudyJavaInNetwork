package day11;

//�Զ���Person�ಢ����װ
public class Person {

	private String name;// ����
	private int age;// ����

	// alt+s ����get��set�����Լ��в��޲ι����.....
	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {

		if (age > 0 && age < 120) {
			this.age = age;
		} else {
			System.out.println("���䲻����");
		}

	}

	public void show() {
		System.out.println("����" + getName() + ",����" + getAge() + "����!");
	}

	public static void test() {
		System.out.println("Person��ľ�̬����");
	}

}
