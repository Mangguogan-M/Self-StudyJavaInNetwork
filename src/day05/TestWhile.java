package day05;

/*
 * ͨ�����ʵ��whileѭ����ʹ�ã���ӡ1~10֮�������
 */
public class TestWhile {

	public static void main(String[] args) {

		// ʹ��forѭ����ӡ
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("--------------------");

		// ʹ��whileѭ����ӡ
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("������whileѭ��");

		System.out.println("--------------------");
		int num = 1;
		while (true) {
			if (num == 11) {
				break;
			}
			System.out.println(num);
			num++;
		}
	}

}
