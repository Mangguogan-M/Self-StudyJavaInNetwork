package day12.inner.demo4;

public class Outer {// �ⲿ��

	// ����������Ա���� һ����̬һ���Ǿ�̬
	private String str1 = "�ⲿ���str1";
	private static String str2 = "�ⲿ���str2";

	// ��Ա���� ��̬
	public static void show1() {
		System.out.println("�ⲿ���show����");

	}

	// ��̬Ƕ����
	// ֻ�ܶ�������ĳ�Աλ�ã����ܶ����ڷ�����������
	public static class Inner {

		private static String str1 = "Ƕ�����str2";

		public void show() {
			System.out.println(str2);
			System.out.println(str1);

			// ����ֱ�ӷ����ⲿ��ķǾ�̬��Ա
			// ����ֱ�ӷ����ⲿ��ľ�̬��Ա
			show1();
		}

	}

}
