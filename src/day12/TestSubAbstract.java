package day12;

public class TestSubAbstract extends TestAbstract {

	public static void main(String[] args) {

		// ���������ָ�������Լ��Ķ���
		TestSubAbstract ts = new TestSubAbstract();
		// ���������ֻ�ܵ����Լ���show()����
		ts.show();

		System.out.println("---------------");
		// ���������ָ������Ķ����γɶ�̬
		TestAbstract ta = new TestSubAbstract();
		// �ڱ���׶ε��ø����show()�����������н׶ε���������д�����Ժ�ķ���
		ta.show();

	}

	@Override
	public void show() {
		System.out.println("���������������");
	}

}
