package day05;

/*
 * ���ʵ��continue�ؼ��ֵ�ʹ��
 */
public class TestContinue {

	public static void main(String[] args) {

		// ѭ����ӡ1~10֮�������
		// ����ܱ�5��������Ҫ�󲻴�ӡ

		for (int i = 1; i <= 10; i++) {
			if (i % 5 == 0) {
				// break;//����ѭ��
				continue;// ��ʾ��������ѭ��������һ��ѭ����ȥִ��i++
			}
			System.out.print(i + "   ");// 1 2 3 4 6 7 8 9
		}

	}
}
