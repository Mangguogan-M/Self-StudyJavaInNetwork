package day09;

/*
 * ���ʵ�ֹ����;�̬�����ʹ��
 */
public class TestBlock {

	{
		System.out.println("�����");// ��2��
	}

	public TestBlock() {
		System.out.println("���췽����");// ��3��
	}

	static {
		System.out.println("��̬����");// ��1��
	}

	public static void main(String[] args) {
		// ��������� �����ȼ���static���е�����
		TestBlock tb = new TestBlock();
	}
}
