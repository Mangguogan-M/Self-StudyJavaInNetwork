package day05;

import java.util.Scanner;

/*
 * ��ʾ�Ƿ�if��֧�ṹ��ģ������Ϸ�İ���(Ӣ������)
 */
public class TestIf {

	public static void main(String[] args) {

		// 1.��ʾ�û�ѡ��Ӣ��
		System.out.println("1.�ɶ�   2.����   3.ʯͷ");
		System.out.println("��ѡ��:");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		// �ж� ����û�ѡ�����1 ��ô����ʾ�û��ɹ�ѡ���ɶ����Ӣ�ۣ������2 ......
		if (num == 1) {
			System.out.println("�ɶ࣬�ҵ�Ƥ�ܺ�......");
		}

		if (num == 2) {
			System.out.println("�ұȽ���,һ���������һ���ߣ�˭Ҳ����ס�ҡ�");
		}

		if (num == 3) {
			System.out.println("���Ǵ�ʯͷ�������......");
		}

	}

}
