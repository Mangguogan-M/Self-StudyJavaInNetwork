package day14;

//��ʾInteger���ʹ��
public class TestInteger {
	public static void main(String[] args) {
		// ʹ��Integer���еĹ��췽����������󣬸���û���޲ι��췽��
		Integer it = new Integer(123);
		// �Զ�����toString()�������õ��ַ������͵�ʮ����������
		System.out.println(it);

		Integer it2 = new Integer("456");
		System.out.println(it2);
		System.out.println("----------------------");
		// ʵ��int���ͺ�Integer����֮����໥ת��
		Integer it3 = Integer.valueOf(789);
		System.out.println(it3);// 789 String���͵�

		int res = it3.intValue();
		System.out.println(res);// 789 int���͵�

		System.out.println("----------------------");
		// ʵ��String������int���͵�ת��
		res = Integer.parseInt("12345");
		System.out.println(res);

		// java.lang.NumberFormatException
		// Ҫ���ַ����е�ÿ���ַ�����ʮ�����������ַ�������������ָ�ʽ�쳣
		// res = Integer.parseInt("12345a");
		System.out.println(res);

		System.out.println("-----------------------");
		// �Զ�װ����Զ�����Ļ���
		Integer it4 = 100; // int => Integer �����Զ�װ�䣬�Զ�����valueOf()
		res = it4; // Integer => int �����Զ����䣬�Զ�����intValue()����
		System.out.println("-----------------------");
		/*
		 * Integer it5 = 128; Integer it6 = 128; Integer it7 = new Integer(128); Integer
		 * it8 = new Integer(128);
		 * 
		 * System.out.println(it5.equals(it6));//true �Ƚ����� System.out.println(it5 ==
		 * it6);//false �Ƚϵ�ַ System.out.println(it7.equals(it8));//true
		 * System.out.println(it7 == it8);//false
		 */

		Integer it5 = 127;
		Integer it6 = 127;
		Integer it7 = new Integer(127);
		Integer it8 = new Integer(127);

		System.out.println(it5.equals(it6));// true �Ƚ�����
		System.out.println(it5 == it6);// false �Ƚϵ�ַ
		System.out.println(it7.equals(it8));// true
		System.out.println(it7 == it8);// false
	}
}
