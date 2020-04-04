package day08;

/*
 * ���ʵ�ַ�������
 */
public class TestOverload {

	void show() {
		System.out.println("show()");
	}

	// ���������أ������ڲ����ĸ�����ͬ
	void show(int i) {
		System.out.println("show(int)");
	}

	// ���������أ������ڲ��������Ͳ�ͬ
	void show(double d) {
		System.out.println("show(double)");
	}

	// �ܷ񹹳����صı��ʣ��������ܷ����֣����βα�����û�й�ϵ
	/*
	 * void show(double e){ System.out.println("show(double)"); }
	 */
	// �����������뷽���ķ���ֵ�����޹�
	/*
	 * int show(double e){ System.out.println("show(double)"); return 1; }
	 */

	void show(int i, double d) {
		System.out.println("show(int,double)");
	}

	void show(double d, int i) {
		System.out.println("show(double,int)");
	}

	public static void main(String[] args) {
		TestOverload to = new TestOverload();
		to.show();
		to.show(0.0);
		to.show(10);
		to.show(1, 0.0);
		to.show(0.5, 2);
	}

}
