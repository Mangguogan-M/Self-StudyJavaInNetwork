package day10;

/*
 * ����
 */
public class Dog extends Animal {

	// �޲ι���
	public Dog() {
		super();// ���ø����޲ι���
	}

	// �вι���
	public Dog(String name, int age) {
		/*
		 * setAge(age); setName(name);
		 */
		super(name, age);// ���ø����вι�����г�ʼ��
	}

	@Override
	public void eat() {
		System.out.println("������");
	}

	// @Override
	public void show2() {
		// System.out.println(getAge()+" "+getName());
		show();// ���ø���ķ��� error �����Լ��ķ�����������ѭ��ģʽ,��ʾջ���
	}

}
