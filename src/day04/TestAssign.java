package day04;

/*
 * ���ʵ�ָ�ֵ�������ʹ��
 * 	  =�� +=��-=��*=��/=��%=
 */
public class TestAssign {
	public static void main(String[] args) {
		// ������� =

		int ia = 3;
		int ib = 6;
		// ��=����ߵ�ֵ��ֵ���ұߵı���������ԭ�е�����
		ib = ia;

		System.out.println(ib);// 3

		System.out.println("---------------------");

		ib += ia;// ib=ib+ia;
		System.out.println(ib);// 6

		System.out.println("---------------------");
		// ������
		byte b1 = 5;
		b1 += 3;// ok �Զ�����ת��
		// 3Ĭ��int���� b1��byte���� ��ӵĽ��int����
		// �൱�ڷ�����int������byte����ת�����Ӵ�-->С ����ǿ������ת��
		// b1 = b1+3;//��Ҫǿ��ת��

		// b1 = (byte)b1+3;//error
		// b1 = (byte)(b1+3);//��ʧ����

		System.out.println(b1);

	}
}
