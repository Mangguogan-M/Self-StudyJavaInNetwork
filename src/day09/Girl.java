package day09;

/*
 * �Զ����࣬���з�װ
 */
public class Girl {

	// ��Ա����
	// 1.˽�л���Ա����
	private String name;// ����
	int age;// ����
	private boolean flg;// �Ƿ���������

	// ���飺���вι����ʱ�򣬼����޲ι���
	public Girl() {

	}

	// һ���Լ���д���죬��ôϵͳ�������ڸ������ɹ���
	public Girl(String name, int age, boolean flg) {
		// this.name = name;
		// this.age = age;
		// this.flg = flg;
		// �ڹ��췽�����е���set��Ա�������к���ֵ���ж�
		setAge(age);
		setName(name);
		setFlg(flg);
	}

	// �Զ����Ա����ʵ����������һ�����Ϊ
	public void grow() {
		age = age + 1;
	}

	// �Զ����Ա����ʵ��������������ָ������ֵ����Ϊ
	public void grow(int age) {
		this.age = this.age + age;
	}

	public void show() {
		System.out.println("����" + name + ",����" + age + "���ˣ�" + (flg ? "�Ѿ���������!" : "��û��������!"));
	}

	// 2.�ṩ������get��set�������ڷ������н��к�����ж�
	// public ��ʾ���еģ�����������λ�ý��з���
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
		// �ڷ������н����������ж�
		if (age > 0 && age <= 18) {
			this.age = age;
		} else {
			System.out.println("���䲻������");
		}
	}

	public boolean getFlg() {
		return flg;
	}

	public void setFlg(boolean flg) {
		this.flg = flg;
	}

}
