package day11;

public class TestPersonStudent {
	public static void main(String[] args) {

		// ʹ�ø��������ָ�����Լ��Ķ���
		Person p = new Person();
		// ����Person���Լ���show()����
		p.show();

		System.out.println("----------------------");
		// ʹ�����������ָ�������Լ��Ķ���
		Student s = new Student();
		// ��������û��show()������ʱ������ø���Person�е�show()����
		// ����������дshow()���������������Student�Լ���show()����
		s.show();

		System.out.println("----------------------");
		// ʹ�ø��������ָ������Ķ����γɶ�̬
		// ����Student������Person���͵�ת����С��Χ���Χ��ת�����Զ�����ת��
		Person ps = new Student("zhangsan", 18, 1010);

		// ˼����ps���õ�show()����������Person��Ļ���Student��ģ�����
		// �������ڱ����ڼ����Person���show(),�����н׶ε���Student��show()����
		ps.show();

		System.out.println("----------------------");
		// ʹ��ps���÷Ǿ�̬�ķ������в���
		// ps��Person���͵����ã���˿��Ե���Person���Լ��ķ���
		String str = ps.getName();
		System.out.println("��ȡ���������ǣ�" + str);

		// ps.getId();//error
		System.out.println("----------------------");
		// ʹ��ps���þ�̬�ķ������в��ԣ���̬�ĳ�Ա�Ƽ�ʹ������.�ķ�ʽ����
		ps.test();// ����
		Person.test();

		System.out.println("----------------------");
		// ���ȥʵ�������з����ĵ����أ�����
		// Person������Student���ͽ���ת���� ��=>С,��Ҫǿ������ת��
		Student st = (Student) ps;
		int rs = st.getId();
		System.out.println("id=" + rs);

		// String sr = (String)ps; error
		// Teacher t = (Teacher)ps;//����ͨ�������в�������ת���쳣
		// java.lang.ClassCastException: day11.Student cannot be cast to day11.Teacher

		// �ж�ps����ָ��Ķ��������Ƿ���Teacher���ͣ������򷵻�true�����򷵻�false

		if (ps instanceof Teacher) {
			System.out.println("���Է��ĵĽ���ǿ������ת����....");
		} else {
			System.out.println("���ܽ���ǿ������ת��");
		}

	}
}
