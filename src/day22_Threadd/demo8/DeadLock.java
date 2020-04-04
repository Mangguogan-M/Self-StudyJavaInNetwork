package day22_Threadd.demo8;

public class DeadLock extends Thread {

	private boolean flg;

	public DeadLock(boolean flg) {
		this.flg = flg;
	}

	@Override
	public void run() {
		// 如果是true 中国人 false 美国人
		if (flg) {

			synchronized (LockObject.obj1) {
				System.out.println("一根筷子");
				synchronized (LockObject.obj2) {
					System.out.println("一把叉");
				}
			}
		} else {
			synchronized (LockObject.obj2) {
				System.out.println("一把刀");
				synchronized (LockObject.obj1) {
					System.out.println("一根筷子");
				}
			}
		}

	}

}
