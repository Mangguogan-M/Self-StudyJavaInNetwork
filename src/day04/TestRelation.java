package day04;

import java.util.Scanner;

/*
 * ���ʵ�ֹ�ϵ�������ʹ��		>��<��==��<=��!=��>=
 */
public class TestRelation {

	public static void main(String[] args) {

		int ia = 5;
		int ib = 2;

		boolean flg = ia > ib;
		System.out.println(flg);// true

		System.out.println(ia > ib);// true
		System.out.println(ia < ib);// false
		System.out.println(ia <= ib);// false С�ڵ��� С�ڻ��ߵ���
		System.out.println(ia >= ib);// true ���ڵ��� ���ڻ��ߵ���
		System.out.println(ia != ib);// true
		System.out.println(ia == ib);// false

		System.out.println("---------------");
		// �ж�ia�����м�¼�������Ƿ�Ϊ��λ������ 10~99
		// System.out.println( 10 <= ia <=99 );//error ����Ԫ����� ���� ��֧�������﷨��ʽ
		// �Ȼὲ�߼������������

		// ��ʾ�û�����һ�����������жϸ������Ƿ�Ϊ�������������ӡtrue ���� false

		// ����Scanner����
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��������");
		int num = sc.nextInt();
		System.out.println(num < 0);

	}

}
