package day03;

import java.util.Scanner;

/*
 * ���ʵ�ֱ�������������
 */
public class TestVarInput {

	public static void main(String[] args) {

		// 1.���������������ڼ�¼����������,������ʹ��������
		// String name ="����";
		// int age = 18;

		// ��ʾ�û��������������䣬���洢�����������ı�����
		System.out.println("�������������������䣺");

		// ����Scanner����
		Scanner sc = new Scanner(System.in);

		// �Ӽ����������Ϣ�ж�ȡһ���ַ������ݷ������name��Ӧ�Ŀռ���
		String name = sc.next();
		//// �Ӽ����������Ϣ�ж�ȡһ���������ݷ������age��Ӧ�Ŀռ���
		int age = sc.nextInt();

		// ��ӡ������������ֵ
		System.out.println("name = " + name + ",age=" + age);

	}

}
