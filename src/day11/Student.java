package day11;

//�Զ���Student��ʵ�ַ�װ    Student�̳���Person���ͣ���Person�������
public class Student extends Person {
	private int id;// ѧ��

	public Student() {
		super();
	}

	public Student(String name, int age, int id) {
		super(name, age);
		setId(id);
	}

	public Student(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {

		if (id > 0) {
			this.id = id;
		} else {
			System.out.println("ѧ�Ų�������");
		}

	}

	@Override
	public void show() {
		super.show();
		System.out.println("ѧ�ţ�" + getId());
	}

	// @Override ��̬����������д
	public static void test() {
		System.out.println("Student���͵ľ�̬����");
	}

}
