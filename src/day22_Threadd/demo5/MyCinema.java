package day22_Threadd.demo5;

public class MyCinema extends Thread {

	static int poll = 100;
	static Object obj = new Object();

	@Override
	public void run() {
		// static int poll = 100; //ÿ�������ﶼ��100��Ʊ

		// Ϊ����ʾһֱ��Ʊ
		while (true) {
			// ͬ�������Ķ����������Щ��?
			synchronized (obj) {
				// m1��m2,m3
				// poll = 100;
				if (poll > 0) {
					try {
						sleep(100);// m1����Ϣһ��,m2Ҳ��Ϣһ��
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(getName() + "���ڳ��۵�" + (poll--) + "��Ʊ");
					// ����״̬��
					// ����1���ڳ��۵�100��Ʊ
					// ����2���ڳ��۵�99��Ʊ
					// �����أ�
					// CPU��ÿһ��ִ�б�����һ��ԭ���ԵĲ���
					// �ȼ�¼��ǰ��ֵ
					// ���Ű�poll--
					// Ȼ�������ǰ��ֵ(m2����)
					// poll��ֵ�ͱ����99
					// �߳�1���ڳ��۵�100��Ʊ
					// �߳�2���ڳ���100��Ʊ
				}

			}
		}

	}
}
