package day15;

import java.util.Scanner;

/*
 * �ָ��
		public String[] split(String regex)
		���ݸ���������ʽƥ���ִ��ַ���
		
		
 */
public class RegexSplit {
	public static void main(String[] args) {

		// ����һ�������������Χ
		String ages = "18-24";

		String reg = "-";

		String[] split = ages.split(reg);

		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}

		// �����Ҫ�õ�int����

		int startAge = Integer.parseInt(split[0]);

		int endAge = Integer.parseInt(split[1]);

		// ����¼������
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		if (age >= startAge && age <= endAge) {
			System.out.println("���Խ���ˡ�");
		} else {
			System.out.println("�������ҵ�Ҫ��gun");
		}

		System.out.println("-------------------");
		String str = "1,2,3,4,5,6";
		String[] split2 = str.split(",");
		for (int i = 0; i < split2.length; i++) {
			System.out.println(split2[i]);
		}

	}
}
