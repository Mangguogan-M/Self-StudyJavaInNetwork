package day15;

import java.util.Date;

public class TestDate {
	public static void main(String[] args) {

		// 1.ʹ���޲εķ�ʽ�������
		Date d1 = new Date();
		System.out.println(d1); // �Զ�����toString() ϵͳʱ��

		// 2.ʹ���вεķ����������
		Date d2 = new Date(1000);
		System.out.println("d2=" + d2);// Thu Jan 01 08:00:01 CST 1970

		System.out.println("--------------------");
		// 3.ʹ���вεĹ��췽��
		/*
		 * year - �� 1900 ����ݡ� month - 0-11 ֮����·ݡ� date - һ���� 1-31 ֮���ĳһ�졣 hrs - 0-23
		 * ֮���Сʱ���� min - 0-59 ֮��ķ������� sec - 0-59 ֮���������
		 */
		Date d3 = new Date(2008 - 1900, 8 - 1, 8, 20, 8, 8);
		System.out.println(d3);

		System.out.println("---------------------");
		// ʹ��getTime()��setTime()����
		long time = d1.getTime();
		System.out.println("��ǰϵͳʱ�����1970 �� 1 �� 1 ��0ʱ0��0��ĺ�����" + time);

		Date d4 = new Date(time);
		System.out.println(d4);

		d2.setTime(2000);
		System.out.println("d2=" + d2);

	}
}
