package day09;

/*
 * ���ʵ��Singleton��ķ�װ
 */
public class Singleton {

	// private static Singleton s = new Singleton();//����ʽ
	private static Singleton sin = null;// ����ʽ

	// 1.�Զ����޲εĹ��췽����ʹ��private �ؼ�������
	private Singleton() {
	}

	// �ṩһ�����е�get��Ա�����ķ���������Ա�������س�ȥ
	public static Singleton getInstance() {

		if (sin == null) {
			sin = new Singleton();
		}
		return sin;
	}

}
