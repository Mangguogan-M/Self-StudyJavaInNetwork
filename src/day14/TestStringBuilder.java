package day14;

public class TestStringBuilder {
	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("hello");
		System.out.println(sb1);// ����toString() hello
		System.out.println("������" + sb1.capacity());// 21 =16 + 5;
		System.out.println("�ַ������ǣ�" + sb1.length());

		System.out.println("--------------------");
		// ʵ�����ַ�������sb1�в���ָ�����ַ�������
		// StringBuilder sb2 = sb1.insert(-1, "abcd");//����ok ���в����쳣

		// StringBuilder���������ַ����б�����Ըı�
		StringBuilder sb2 = sb1.insert(0, "abcd");
		System.out.println(sb2);// abcdhello
		System.out.println(sb1);// abcdhello

		// String���������ַ����б�����ı�
		String s1 = "hello";
		String s2 = s1.toUpperCase();
		System.out.println(s1);// hello
		System.out.println(s2);// HELLO

		System.out.println("----------------");
		sb1.insert(4, "1234");
		// �ַ���ĩβ׷������
		StringBuilder sb3 = sb1.append("world");
		System.out.println(sb1);
		System.out.println(sb3);

		// ��������ַ���������ʼ������ʱ������Զ�����������
		System.out.println("������" + sb1.capacity());// 21 =16 + 5;
		System.out.println("�ַ������ǣ�" + sb1.length());

		System.out.println("--------------------");
		// ʵ���ַ������ݵ�ɾ�� "hello"�Ƴ�
		sb1.delete(8, 13);
		System.out.println(sb1);

		System.out.println("--------------------");
		// ʵ���ַ��������ݵ��޸ģ���abcd���滻ΪABCD
		sb1.replace(0, 4, "ABCD");
		System.out.println(sb1);

		System.out.println("---------------------");
		// �ַ����ķ�ת
		sb1.reverse();
		System.out.println(sb1);

		System.out.println("----------------------");
		// ʵ��StringBuilder������String���͵�ת��
		// String s3 = new String(sb1);
		String s3 = sb1.toString();
		System.out.println(s3);
		// ʵ��String������StringBuilder����ת��
		StringBuilder sb4 = new StringBuilder(s3);
		System.out.println(sb4);

	}
}
