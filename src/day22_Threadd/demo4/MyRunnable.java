package day22_Threadd.demo4;

//第二种线程实现方式 实现Runnable接口，完成线程创建
public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}

}
