package day13;

public class TestStudent {
	public static void main(String[] args) {

		Student s1 = new Student(1001, "zhangfei");
		Student s2 = new Student(1001, "zhangfei");

		System.out.println(s1 + "  " + s2);
		// ����equals�������ж����������Ƿ���ȣ�����Ĭ�ϴ�Object���м̳�������

		// �÷���Ĭ�ϱȽ϶���ĵ�ַ
		// ����дequals�����������������д�Ժ�İ汾���Ƚ�����
		boolean b1 = s1.equals(s2);
		System.out.println("b1 = " + b1);// b1 = false
		System.out.println(s1 == s2);// false

		// ----------------------

		// String����дequals���� ���бȽϵ���������
		System.out.println("���".equals("���"));// true

		System.out.println("------------------------");

		// ���ô�Object���м̳е�hashCode��������ȡ��Ӧ�Ĺ�ϣ��
		// ��Student������дhashCode�������������д�Ժ�İ汾
		int res = s1.hashCode();
		System.out.println("res =" + res);
		res = s2.hashCode();
		System.out.println("res =" + res);

		System.out.println("-----------------------");
		String str1 = s1.toString();
		System.out.println(str1);
		System.out.println(s1);// Ĭ�ϵ���toString()����

		String str3 = "hello";
		str3 = str3 + s1;// ����toString()����
		System.out.println(str3);// ��ΪString��д��toString�������һ���д��equals����

	}
}
