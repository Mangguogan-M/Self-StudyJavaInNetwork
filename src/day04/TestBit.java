package day04;

/*
 * ���ʵ��λ�����ʹ��  <<  >>  >>>
 */
public class TestBit {
	public static void main(String[] args) {

		// ��ʾ5ת���Ķ����������ƶ�5λ���ұ߲�0
		System.out.println(5 << 5);// 160

		System.out.println(5 >> 1);// 0000 0010 =>2

		System.out.println(5 >>> 1);// 0000 0101 =>2

		/*
		 * -14>>>2 ����ʮ����ת��λ������ 0000 1110 1111 0001 1111 0010
		 * 
		 * 0111 1001 0011 1100
		 *
		 * -14>>>2 11111111 11111111 11111111 11110010 0011111111 11111111 11111111
		 * 111100
		 *
		 */
		System.out.println(-14 >>> 2);

		System.out.println("-------------------------");

		System.out.println(5 & 8);// ��λ��
		System.out.println(5 | 8);// ��λ�� 13
		System.out.println(5 ^ 8);// ��λ�� 13
		System.out.println(~8);// ��λ��
		System.out.println(~-10);

	}
}
