package day04;

/*
 * ���ʵ�������������ʹ�� +  -  *  /  %
 */
public class TestAri {

	public static void main(String[] args) {

		// ��������int���͵ı����洢����
		int ia = 10;
		int ib = 5;

		// ��ӡ����
		System.out.println("ia =" + ia);
		System.out.println("ib =" + ib);

		System.out.println("-------------------------");

		// ��ʾ��ia+ib�Ľ����ֵ������res ���б���
		// ���н� ia+ib�����֮Ϊ���ʽ,ia��ib������������ + ����������/�����
		int res = ia + ib;
		System.out.println("res=" + res);// res=15

		// ��ʾ�ȼ���ia+ib�Ľ���ٽ��д�ӡ�������ӡ��Ϻ����ݶ�ʧ
		System.out.println(ia + ib);// 15
		System.out.println(ia - ib);// 5
		System.out.println(ia * ib);// 50
		System.out.println(ia / ib);// 2
		System.out.println(ia % ib);// 0

		System.out.println("-------------------------");

		// ���������ֻ��ȡ�������֣�С������������
		System.out.println(5 / 2);// 2
		System.out.println((double) 5 / 2);// 2.5

		System.out.println(5 / (double) 2);// 2.5
		System.out.println((double) (5 / 2));// 2.0

		System.out.println(1.0 * 5 / 2);// 2.5

		System.out.println("-------------------------");

		// 0������������ ������� java.lang.ArithmeticException(�����쳣): / by zero
		// System.out.println(5 / 0);
		// System.out.println(5 / 0.0);//Infinity �����

		System.out.println(0 / 0.0);// NaN Not a Number

		System.out.println("-------------------------");
		// + �ַ������ӷ�

		System.out.println("2" + 4 + 3);// 243
		System.out.println(4 + 3 + "2");// 72

	}

}
