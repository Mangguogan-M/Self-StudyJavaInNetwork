package day22_Threadd.demo5;

/*
 * 
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
		m1.setName("����");
		MyCinema m2 = new MyCinema();
		m2.setName("����");
		MyCinema m3 = new MyCinema();
		m3.setName("�ŷ�");

		m1.start();
		m2.start();
		m3.start();

	}
}
