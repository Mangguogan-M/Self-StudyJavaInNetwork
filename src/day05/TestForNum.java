package day05;

/*
 * ���ʹ��forѭ����ӡ 10~1֮�������
 */
public class TestForNum {
	public static void main(String[] args) {

		// int i = 1;
		// ѭ����ӡ1~10֮�������
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}

		System.out.println("-----------------------");
		// ѭ����ӡ10~1֮�������
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

		System.out.println("------------------------");
		// ʹ��forѭ����ӡ1~100֮�������
		for (int i = 1; i <= 100; i++) {
			// ����Ҫ��ĳ�����Ͻ��������жϵ�ʱ����ѡ��ȥִ��һ�δ����ʱ����Ҫʹ�÷�֧�ṹ
			if (i % 2 != 0) {// ���iȡ��2 ������0 ˵�����ܱ�2���� ����ô��������
				System.out.print(i + "   ");
			}
		}
		System.out.println();
		System.out.println("------------------------");
		for (int i = 1; i <= 100; i += 2) {
			System.out.print(i + "   ");
		}

		System.out.println("------------------------");
		// ʹ��forѭ����ӡ1~100֮���ż��
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {// ���i�ܱ�2���� ˵����ż��
				System.out.print(i + "   ");
			}
		}
		System.out.println();
		System.out.println("------------------------");

		for (int i = 2; i <= 100; i += 2) {
			System.out.print(i + "   ");
		}

	}
}
