package day05;

import java.util.Scanner;

/*
 * ��ʾʹ��if-else if-else��֧�ṹģ�����Ʊ�İ���
 * 
 * 		����			��Ʊ
 * 		ѧ��			��Ʊ
 * 		�������		ȫƱ
 * 
 */
public class TestIfelseIfelse {

	public static void main(String[] args) {

		// 1.��ʾ�û����������Ϣ
		System.out.println("���������������Ϣ:");
		Scanner sc = new Scanner(System.in);
		// ʹ�ñ�����¼�����Ϣ
		String str = sc.next();

		// �ж��û��������Ϣ�����ݲ�ͬ�������Ϣ������ͬ�۸�ĳ�Ʊ��
		// == һ��Ƚϵ�ַ ������ "����" equals()
		if ("����".equals(str)) {
			System.out.println("��Ʊ");
		} else if ("ѧ��".equals(str)) {
			System.out.println("��Ʊ");
		} else {
			System.out.println("ȫƱ");
		}

		System.out.println("���Ŵ��ȥ·��,һ·ɳ����.....");

	}

}
