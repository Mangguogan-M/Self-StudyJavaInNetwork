package day02;

/*
	���ʵ�ֶ��������͵�ʹ��	byte��short��int��long
	ʵ���Զ�����ת����ǿ������ת��
*/

public class TestInt2 {

	public static void main(String[] args) {

		// ����һ��byte���͵ı���������Ϊb1 ��ʼֵΪ10
		byte b1 = 10;

		short s1 = 20;

		System.out.println("b1= " + b1);// b1 = 10
		System.out.println("s1= " + s1);// s1 = 20

		System.out.println("------------------------");
		// �����Զ�����ת��,��С��Χ���Χת��

		// = ��ֵ �Ⱥ��ұߵ����ݸ�ֵ���Ⱥ���ߵ�����
		// b1��byte���� 1�ֽ� s1 short���� ռ2�ֽ� byte=>short
		s1 = b1;// ����û����

		System.out.println("b1= " + b1);// b1 = 10
		System.out.println("s1= " + s1);// s1 = 10

		System.out.println("------------------------");
		// ����ǿ������ת�� �Ӵ�Χ��С��Χת��

		// ��s1 ��ֵ��b1 s1��short 2���ֽ� b1 byte���� 1���ֽ� short=>byte

		// ���벻ͨ��
		// b1 = s1;// ����: �����ݵ�����: ��shortת����byte���ܻ�����ʧ����

		/*
		 * 0000 0000 1000 0000 16λ2����λ ��ʾ128 short 1000 0000 byte -128
		 */
		s1 = 128;

		b1 = (byte) s1; // ��16λ2����λ ת���� 8λ2����

		System.out.println(b1);

		System.out.println("------------------------");
		byte b2 = 10;// ֱ����Ĭ����int����

		int i1 = 10;

		// b2 = i1;//��������ͨ�������ܴ�����ʧ���� i1�Ǹ����� ��ֵ��ʱ�����ܷ����ı�
		b2 = (byte) i1;// ������ͨ��

		System.out.println(b2);

		System.out.println("------------------------");

		// �����⣺
		byte b23 = 10;
		int i13 = 10;
		// b23 = i13;//Java������һ�Ű�ȫ�ԱȽϸߵ�����

	}

}