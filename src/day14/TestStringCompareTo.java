package day14;

public class TestStringCompareTo {
	public static void main(String[] args) {

		String s1 = new String("abc");

		// ����compareTo()����ʵ���ַ�����С�ıȽ�
		System.out.println(s1.compareTo("bcd"));// ���� -1 'a' - 'b'
		System.out.println(s1.compareTo("abe"));// ���� -2 'c' - 'e'
		System.out.println(s1.compareTo("abcdef"));// ���� -3 3-6

		System.out.println("--------------------------");
		// ��Ӧλ�õ��ַ������������������ַ���ͬ���ó���������
		System.out.println(s1.compareTo("aaa"));// ���� 1 'b' - 'a'
		System.out.println(s1.compareTo("aba"));// ����2 'c' - 'a'
		System.out.println(s1.compareTo("")); // ����3 3-0

		System.out.println("--------------------------");
		// 'a' 97 A '65'
		System.out.println(s1.compareTo("Abc")); // ����32
		System.out.println(s1.compareToIgnoreCase("Abc"));// 0

	}
}
