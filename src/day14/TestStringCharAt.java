package day14;

public class TestStringCharAt {
	public static void main(String[] args) {
		// ʹ���޲ι�������������
		String s1 = new String();
		int len = s1.length();
		System.out.println("len = " + len);

		System.out.println("---------------------");
		// ʹ���вι��췽�����������
		String s2 = new String("hello");
		len = s2.length();
		System.out.println("len = " + len);

		// ʹ��charAt()��������ȡ����ĵ����ַ�
		// char cv = s2.charAt(-1); �����ַ����±�Խ���쳣
		char cv = s2.charAt(0);
		System.out.println(cv);// h

		cv = s2.charAt(4);
		System.out.println(cv);// o

		System.out.println("------------------");
		// ��ӡ�ַ����е������ַ�
		for (int i = 0; i < s2.length(); i++) {
			System.out.println(s2.charAt(i));
		}

	}
}
