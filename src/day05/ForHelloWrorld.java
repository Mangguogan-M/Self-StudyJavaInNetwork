package day05;

/*
 * ��ʾ�� ���50�䡰HelloWorld��
 */
public class ForHelloWrorld {
	public static void main(String[] args) {

		/*
		 * System.out.println("HelloWorld"); System.out.println("HelloWorld");
		 * System.out.println("HelloWorld"); System.out.println("HelloWorld");
		 * System.out.println("HelloWorld");
		 */
		// .....

		int num = 0;
		// ����forѭ�����Ż�����
		// ��forѭ����() ��{} �������ı��������������,������������forѭ��
		for (int i = 0; i < 50; i++) {
			System.out.println("HelloWorld");
			num++;
		}

		System.out.println(num);
	}
}
