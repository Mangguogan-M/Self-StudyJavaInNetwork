package day22_Threadd.demo3;

/*
 * �߳�����  \ �߳��ò�
	public static void yield()      �����߳����в���
	��ͣ��ǰ����ִ�е��̶߳��󣨼�������ǰӵ�е�cup��Դ������ִ�������̡߳��ö���̵߳�ִ�и���г�����ǲ��ܿ�����֤һ��һ�Ρ�
 */
public class TestMyYield {
	public static void main(String[] args) {
		MyYield my1 = new MyYield();
		MyYield my2 = new MyYield();

		my1.setName("����");
		my2.setName("����");

		my1.start();
		my2.start();

	}
}
