package day04;

/*
 * ���ʵ���������Լ��������ʹ�� ++  --
 */
public class TestSelf {
	public static void main(String[] args) {

		int ia = 3;
		System.out.println(ia);// 3

		// ��ia��ֵ �����1
		int ib = ia++;
		System.out.println(ia);// 4
		System.out.println(ib);// 3

		System.out.println("---------------");

		// ��++����ʾ����������������ʹ�ã�Ҳ����˵��������ٸ�ֵ ���������ia��ֵ���� 5
		System.out.println(ia++);// 4
		// ǰ++��ʾ��++��ʹ�ã�Ҳ������++֮��Ľ����Ϊ���ʽ�������� 6
		System.out.println(++ia);// 6

		System.out.println("---------------");
		// ������ ���鿪���о��Բ�����ʹ��
		System.out.println(ia);// 6
		System.out.println(ia++ + ++ia); // 14 = 6 + 8
		System.out.println(ia);// 8

	}
}
