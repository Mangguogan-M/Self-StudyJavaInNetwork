package day05;

import java.util.Scanner;

/*
 * ��ʾif-else ��֧�ṹģ�⿼���Ƿ�ͨ�������İ���
 */
public class TestIfelse {
	public static void main(String[] args) {

		// 1.��ʾ�������뿼�Գɼ�
		System.out.println("���������Ŀ��Գɼ�:");
		Scanner sc = new Scanner(System.in);

		int score = sc.nextInt();

		// 2.ͨ���û�����Ŀ��Գɼ����жϳɼ��Ƿ�ϸ�����ϸ������һ���׶Σ�����ȴ�����
		if (score >= 60) {// ������ڵ���60�� ������
			System.out.println("�ɼ��ϸ񣬽����¸��׶Ρ�");
		} else {// ���������
			System.out.println("�ȴ��´β���֪ͨ......");
		}

		System.out.println("��������ңԶ�ľ����������if������else�������ཻȴ����Զ���롣");

	}
}
