package day22_Threadd.demo8;

/*
 * ������
 * 		�����˳Է�һ�ѵ�һ�Ѳ�
 * 		�й��˳Է�һ˫����
 * 
 * 		����������һ�������
 * 			����������һ�ѵ���һ������
 * 			�й�������һ�����Ӻ�һ�Ѳ�
 * 
 * 			
 * 			�����໥�ȴ�������������
 */
public class TestDeadLock {
	public static void main(String[] args) {

		// �й���
		DeadLock d1 = new DeadLock(true);
		d1.start();

		// ������
		DeadLock d2 = new DeadLock(false);
		d2.start();

	}
}
