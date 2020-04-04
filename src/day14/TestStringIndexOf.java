package day14;

public class TestStringIndexOf {
	public static void main(String[] args) {

		// 1.�����ַ�������
		String s1 = new String("Good Good Study,Day Day Up!");

		// 2.�����ַ���������
		// ���ҵ����ַ��ڸ��ַ����е�����λ�ò�����
		int pos = s1.indexOf('g');
		System.out.println(pos);// -1

		pos = s1.indexOf('G');
		System.out.println(pos);// 0

		// ��ָ��λ�ò�ѯ�ַ����ֵ��±�λ��
		pos = s1.indexOf('G', 0);
		System.out.println(pos);// 0

		pos = s1.indexOf('G', 1);
		System.out.println(pos);// 5

		System.out.println("-------------------------");
		// ���ҵ����ַ����ڸ��ַ����е�����λ�ò�����
		pos = s1.indexOf("day");
		System.out.println(pos);

		pos = s1.indexOf("Day");
		System.out.println(pos);// 16

		pos = s1.indexOf("Day", 16);
		System.out.println(pos);// 16

		pos = s1.indexOf("Day", 17);
		System.out.println(pos);// 20

		// ���±겻���ڲ�û�з����쳣�����Ƿ��� -1
		pos = s1.indexOf("Day", 27);
		System.out.println(pos);

		System.out.println("------------------------");
		// ʹ��lastIndeOf()�������Ҹ��ַ����һ�γ��ֵ�����λ��
		// Good Good Study,Day Day Up!
		pos = s1.lastIndexOf('D');
		System.out.println(pos);// 20

		pos = s1.lastIndexOf('D', 20);
		System.out.println(pos);// 20
		pos = s1.lastIndexOf('D', 19);
		System.out.println(pos);// 16

		pos = s1.lastIndexOf('D', 15);
		System.out.println(pos);// -1

		System.out.println("------------------");
		// ʹ��lastIndexOf()���������ַ������һ�γ��ֵ�����λ��
		// Good Good Study,Day Day Up!
		pos = s1.lastIndexOf("Good");
		System.out.println(pos);// 5

		pos = s1.lastIndexOf("Good", 5);
		System.out.println(pos);// 5

		pos = s1.lastIndexOf("Good", 4);
		System.out.println(pos);// 0

		pos = s1.lastIndexOf("Good", -1);
		System.out.println(pos);// -1

		System.out.println("--------------------");
		// ��ȡ��ǰ�ַ�����ָ���±�λ�õ����ַ���
		// Good Good Study,Day Day Up!
		String s2 = s1.substring(3);
		System.out.println(s2);
		System.out.println(s1);

		// ����4 ������10 ȡͷ��ȡβ
		String s3 = s1.substring(4, 10);
		System.out.println(s3);// Good
		System.out.println(s1);// Good Good Study,Day Day Up!

	}
}
