package day02;

public class TestInt {

	public static void main(String[] args) {

		// ����int���ͱ��� int���͵ķ�Χ ����21��
		// int ia = 2200000000;//����: ���������: 2200000000 ����������Χ
		int ia = 2100000000;
		System.out.println(ia);

		// ����byte���ͱ��� byte���͵ķ�Χ -128~127
		// byte b1 = 129; // ����: �����ݵ�����: ��intת����byte���ܻ�����ʧ
		byte b1 = 127;
		System.out.println(b1);
		// ����short���͵ı��� short���͵ķ�Χ -32768~32767
		short s1 = 32767;

		System.out.println(s1);
		// ����long���͵ı��� long ���� ��int���ͻ�Ҫ�� �������Сl���ߴ�L�����֡�
		long l1 = 210000000000l;
		System.out.println(l1);

	}

}