package day14;

import java.util.Scanner;

/*
 * ͨ��equalsIgnoreCaseʵ���û���¼
 */
public class TestStringLogin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 3.ʹ��forѭ����ģ����û�3������Ļ���
		for (int i = 3; i > 0; i--) {

			// 1.��ʾ�û��ֱ������û�����������Ϣ
			System.out.println("�������û�����Ϣ��");
			String username = sc.nextLine();

			System.out.println("������������Ϣ��");
			String password = sc.nextLine();

			// 2.�ж��û�������û����������Ƿ���ȷ�����������Ӧ����ʾ
			// ���ַ�������ֵ���ַ��������Ƚ��Ƿ���ȵ�ʱ���Ƽ�ʹ���ַ�������ֵ�����÷���
			// �����ָ���쳣�ķ���
			if ("admin".equalsIgnoreCase(username) && "123".equalsIgnoreCase(password)) {
				System.out.println("��¼�ɹ���");
				break;
			} else {
				System.out.println("�û�����������󣬵�¼ʧ�ܣ�������" + (i - 1) + "�λ���");
			}

			// ���û�ʹ��������һ�λ�����򶳽��˻�
			if (i == 1) {
				System.out.println("�˺��Ѷ��ᣬ��������");
			}

		}

	}
}
