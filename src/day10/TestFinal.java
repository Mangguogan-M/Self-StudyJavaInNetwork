package day10;

public class TestFinal {
	// final�������γ�Ա����
	// final���γ�Ա������ʾ����ָ����ʼֵ���ܸ���,�������ձ���
	private /* final */ int count = 0;

	public static void main(String[] args) {
		TestFinal tf = new TestFinal();
		System.out.println(tf.count);
		tf.count = 20;

		System.out.println(tf.count);
	}
}
