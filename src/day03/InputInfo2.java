package day03;

import java.util.Scanner;

/*
 * ��ʾ��Scanner����
 * 		next()��nextLine()�����Ĳ��
 * 
 * 
 * 		next()
			��������Ч�ַ�ǰ�Ŀո�
			��������Ч�ַ�֮�󣬽��������Ŀո�
			����Tab����Enter������Ϊ�ָ����������
		nextLine()
			������Ч�ַ�ǰ�Ŀո�
			������ֻ��Enter��
 */
public class InputInfo2 {
	public static void main(String[] args) {
		System.out.println("�������û�����");
		// ����Scanner����
		Scanner sc = new Scanner(System.in);
		String username = sc.next();
		System.out.println("�û�����:" + username);

		System.out.println("���������룺");
		// String password = sc.nextLine();
		String password = sc.next();
		System.out.println("������:" + password);

	}
}
