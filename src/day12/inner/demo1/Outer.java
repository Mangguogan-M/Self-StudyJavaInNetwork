package day12.inner.demo1;

//��ʾ��Ա�ڲ����ʹ��
public class Outer {// �ⲿ��
	private String str = "Outer���str1";
	private String str2 = "Outer���str2";

	/*
	 * ��һ���ڲ������Ʋ������ⲿ������ �ڶ�������ʹ��final���������η�����
	 */

	public class Inner {// �ڲ���
		private String str = "Inner���str1";
		private String str2 = "Inner���str2";

		public void show() {
			// �ڲ���ĳ�Ա�������ⲿ���Ա
			System.out.println(str);
			System.out.println(str2);

			// ʹ�á��ⲿ����.this.��Ա�������ⲿ��ĳ�Ա
			System.out.println(Outer.this.str2);
		}

	}

}
