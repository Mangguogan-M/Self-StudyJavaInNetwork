package day05;

import java.util.Scanner;

/*
 * ��ʾbreak��ʹ��
 */
public class TestBreak {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);// ���ѭ������
			if (i % 5 == 0) {
				break;// ����ѭ��ִ�к��������
			}
		}

		// ���������

		System.out.println("----------------");

		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.println("1. �û���¼   2.�û�ע��     3.�˳�ϵͳ");
			System.out.println("��ѡ��:");
			int num = sc.nextInt();

			if (num == 3) {
				break;
			}

		}

		System.out.println("�ɹ��˳�ϵͳ����ӭ�´�����.....");

	}
}
