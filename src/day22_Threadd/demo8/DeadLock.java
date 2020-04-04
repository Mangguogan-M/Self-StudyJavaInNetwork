package day22_Threadd.demo8;

public class DeadLock extends Thread {

	private boolean flg;

	public DeadLock(boolean flg) {
		this.flg = flg;
	}

	@Override
	public void run() {
		// �����true �й��� false ������
		if (flg) {

			synchronized (LockObject.obj1) {
				System.out.println("һ������");
				synchronized (LockObject.obj2) {
					System.out.println("һ�Ѳ�");
				}
			}
		} else {
			synchronized (LockObject.obj2) {
				System.out.println("һ�ѵ�");
				synchronized (LockObject.obj1) {
					System.out.println("һ������");
				}
			}
		}

	}

}
