package day09;

//���ʵ��Student��ķ�װ���̳�Person ��
public class Student extends Person {

	private int id;

	public Student() {
		super();// ��ʾ���ø�����޲ι��췽�������������Զ����
	}

	public Student(String name, int age, int id) {
		super(name, age);// ��ʾ���ø������вι��췽��
		/*
		 * setAge(age); setName(name);
		 */
		setId(id);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// ��ע��������ȷ���߱���������ķ����ǶԸ����з�������д����û�й�����д�����
	@Override
	public void show() {
		// ���ø����е�show() �����Ϳ��Դ�ӡ������������
		super.show();
		System.out.println("ѧ����:" + getId());
	}

}
