package day07;

public class TestPerson {
	public static void main(String[] args) {

		// ����Person����
		// ��ߵ����� ���ڼ�¼�ұߵ�ַ
		Person p = new Person();
		// ͨ�� ��������.��Ա������

		p.name = "����";
		p.age = 18;

		System.out.println(p.name + "   " + p.age);

		// ��Ա�����ĵ��� ��������.��Ա����
		p.show();

	}
}
