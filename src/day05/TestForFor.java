package day05;

import java.util.Scanner;

/*
 * ��ʾ��Ƕ��ѭ��
 * 		��3���༶��4��ѧԱ��������μ���ÿ���༶����ѧԱ��ƽ���֣�
 */
public class TestForFor {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 3; i++) {
			System.out.println("�������" + i + "���༶�ĳɼ�");
			int sum = 0;
			// 4��ѧԱ����
			for (int j = 1; j <= 4; j++) {
				System.out.println("��" + j + "��ѧ���ĳɼ���");
				int score = sc.nextInt();
				sum += score;
			}
			System.out.println("��" + i + "���༶��ƽ������:" + (sum / 4));
		}

	}
}
