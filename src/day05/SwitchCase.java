package day05;

import java.util.Scanner;

/*
 * ��ʾswitch-case�ṹ��ʹ��
 */
public class SwitchCase {

	public static void main(String[] args) {

		System.out.println("*********��ӭ������Ʒ����ϵͳ*********");
		System.out.println("1.�û���¼  2.�û�ע��   3.��ѯ��Ʒ");
		System.out.println("4.�����Ʒ  5.������ѯ   6.�����ѯ");
		System.out.println("7.�˳�ϵͳ");
		System.out.println("��ѡ��:");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		switch (num) {
		case 1:
			// ����1
			System.out.println("�������û�");
			System.out.println("����������");
			break;// break ִ��������˳�switch�飬������ִ����������
		case 2:
			// ����2
			System.out.println("��������Ҫע�����Ϣ");
			break;
		case 3:
			// ����3
			System.out.println("��Ʒ��Ϣչʾ");
			break;

		default:
			System.out.println("��������ȷ�����֡�");
		}

		System.out.println("�˳���Ʒ����ϵͳ");
	}
}
