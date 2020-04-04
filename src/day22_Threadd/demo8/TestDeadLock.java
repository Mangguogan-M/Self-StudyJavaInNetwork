package day22_Threadd.demo8;

/*
 * 死锁：
 * 		美国人吃饭一把刀一把叉
 * 		中国人吃饭一双筷子
 * 
 * 		现在有这样一种情况：
 * 			美国人手里一把刀和一根筷子
 * 			中国人手里一根筷子和一把叉
 * 
 * 			
 * 			两者相互等待，陷入死锁。
 */
public class TestDeadLock {
	public static void main(String[] args) {

		// 中国人
		DeadLock d1 = new DeadLock(true);
		d1.start();

		// 美国人
		DeadLock d2 = new DeadLock(false);
		d2.start();

	}
}
