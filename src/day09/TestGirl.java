package day09;

/*
 * ������
 */
public class TestGirl {

	public static void main(String[] args) {

		Girl g = new Girl();
		g.show();// null 0 ��û��������!

		// ʹ���вι���÷�ʽ����
		Girl g1 = new Girl("���", -18, true);
		g1.show();// ��� -18 true
		g1.grow();
		g1.show();
		g1.grow(10);
		g1.show();

	}

}
