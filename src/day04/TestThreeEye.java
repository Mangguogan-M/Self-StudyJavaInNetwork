package day04;

import java.util.Scanner;

/*
 * ���ʹ����Ŀ��������ж��û����������������������������
 */
public class TestThreeEye {

	public static void main(String[] args) {

		// 1.����Scanner����
		Scanner sc = new Scanner(System.in);

		System.out.println("������һ��������");

		int num = sc.nextInt();

		// ʹ����Ŀ����������жϲ���ӡ

		System.out.println(num < 0 ? "����" : (num > 0 ? "����" : "��"));

	}

}
