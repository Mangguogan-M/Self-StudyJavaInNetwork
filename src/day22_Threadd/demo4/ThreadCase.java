package day22_Threadd.demo4;

/*
 * �����Ǹ��߳�
 * 		����̶߳Ա�������++
 * 		����̶߳Ա�������--
 * 
 * 		Ϊʲô�������0��ÿ�����ж���һ����
 */
public class ThreadCase {

	static int num = 0;

	public static void main(String[] args) {

		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				new Thread(new Runnable() {

					@Override
					public void run() {
						num++;
					}
				}, "�߳�" + i).start();
			} else {
				new Thread(new Runnable() {

					@Override
					public void run() {
						num--;
					}
				}, "�߳�" + i).start();
			}
		}
		System.out.println(num);
	}
}
