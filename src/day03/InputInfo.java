package day03;

import java.util.Scanner;

/*
 * ��ʾ:Scanner��ʹ��
 * 
 * 
 * 		ʹ�ò���
			1.�����	   
					import java.util.Scanner;
			2.����Scanner����
					Scanner input = new Scanner(System.in);
			����Scanner����ķ�����ʵ�ֶ�ȡ
 */
public class InputInfo {
	public static void main(String[] args) {
		System.out.println("*********��ӭ������Ʒ����ϵͳ*********");
		System.out.println("1.�û���¼  2.�û�ע��   3.��ѯ��Ʒ");
		System.out.println("4.�����Ʒ  5.������ѯ   6.�����ѯ");
		System.out.println("7.�˳�ϵͳ");
		System.out.println("��ѡ��:");

		// ����Scanner����
		Scanner sc = new Scanner(System.in);

		// ��ȡ���� ����Scanner����ķ�����ʵ�ֶ�ȡ
		String str = sc.next();

		// String str1 = sc.next();

		System.out.println("�û�������ǣ�" + str);
		// System.out.println("�û�������ǣ�"+str1);

	}
}
