package day05;

/*
 * ���ʹ��do-whileѭ������ӡ1~10֮�������
 */
public class TestDoWhile {
	public static void main(String[] args) {

		// 1.ʹ��whileѭ����ӡ1~10����
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		System.out.println("----------------------");
		// 2.ʹ��do-whileѭ����ӡ1~10����
		i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);// do-whileѭ���ṹ��С���ŵĺ������зֺŵģ�������ѭ����û��

	}
}
