package day22_Threadd.demo6;

/*
 * 
		ĳ��ӰԺĿǰ������ӳϲ���Ƭ������100��Ʊ��������3����Ʊ������Ʊ�������һ������ģ��õ�ӰԺ��Ʊ��
		
		
		���⣺
			������ͬƱ��
			���ָ�Ʊ
			
			
			ͬ�������
				��ʽ��
					synchronized(����){��Ҫͬ���Ĵ���;}
				ͬ�����Խ����ȫ����ĸ���ԭ������Ǹ������ϡ��ö�����ͬ���Ĺ��ܡ�
				ͨ��ͬ����������̰߳�ȫ����
 */
public class TestMyCinema {
	public static void main(String[] args) {

		MyCinema m1 = new MyCinema();
		Thread t1 = new Thread(m1, "�߳�1");
		Thread t2 = new Thread(m1, "�߳�2");
		Thread t3 = new Thread(m1, "�߳�3");

		t1.start();
		t2.start();
		t3.start();

	}
}
