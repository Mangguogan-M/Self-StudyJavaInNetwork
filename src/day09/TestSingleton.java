package day09;

//自定义TestSingleton类，在main方法中有且只能得到Singleton类中的一个对象。
public class TestSingleton {
	public static void main(String[] args) {

		/*
		 * Singleton s1 = new Singleton(); Singleton s2 = new Singleton();
		 * System.out.println(s1); System.out.println(s2); System.out.println(s1 ==
		 * s2);//false 等到的singleton类中的两个对象
		 */

		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);// true
	}
}
