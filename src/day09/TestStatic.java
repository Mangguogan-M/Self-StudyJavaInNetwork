package day09;

/*
 * ��̹۲�һ����static���κ�û��static���ε�����
 */
public class TestStatic {

	private int ot = 1;// �����ڶ���㼶��ÿ������ӵ�ж�����һ��
	private static int cot = 3;// ��������㼶�ģ����ж�����ͬһ��

	public void show() {// �����ڶ���㼶��ʹ�ö���.��ʽ����
		System.out.println("ot = " + this.ot);
		System.out.println("cot = " + this.cot);
	}

	public static void test() {// ��������㼶��ʹ������.�ķ�ʽ����
		// System.out.println("ot = "+ot); error
		System.out.println("cot = " + cot);

	}

	public static void main(String[] args) {
		TestStatic ts = new TestStatic();
		ts.show();

		// ����.
		// ���þ�̬�������߾�̬����
		TestStatic.test();
	}

}
