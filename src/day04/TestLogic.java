package day04;

/*
 * �ж�ia�����м�¼�������Ƿ�Ϊ��λ������   10~99
 */
public class TestLogic {
	public static void main(String[] args) {

		int ia = 11;

		// ia���ڵ���10 ���� iaС�ڵ��� 99�� ������㷵��true ���򷵻�false
		System.out.println(ia >= 10 && ia <= 99);

		System.out.println("----------------");

		boolean b1 = true;
		boolean b2 = false;

		System.out.println(b1 && b2);// false
		System.out.println(b1 || b2);// true
		System.out.println(!b1);// false
		System.out.println(!b2);// true

		System.out.println("----------------");

		int ib = 3;
		int ic = 2;

		// ��һ������Ϊ�٣������ڶ�������ִ��
		boolean b3 = (++ib == 3 && ++ic == 3);
		System.out.println(b3);// false
		System.out.println(ib);// 4
		System.out.println(ic);// 2

		System.out.println("----------------");
		// ��һ������Ϊ��������ڶ���������ִ��
		boolean b4 = (++ib == 5 || ++ic == 3);
		System.out.println(b4);// true
		System.out.println(ib);// 5
		System.out.println(ic);// 2

	}
}
