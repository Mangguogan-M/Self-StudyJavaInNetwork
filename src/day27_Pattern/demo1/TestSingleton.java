package day27_Pattern.demo1;

public class TestSingleton {
	public static void main(String[] args) {

		/*
		 * Singleton singleton1 = new Singleton(); Singleton singleton2 = new
		 * Singleton(); Singleton singleton3 = new Singleton();
		 */
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		Singleton singleton3 = Singleton.getInstance();

		System.out.println(singleton1);
		System.out.println(singleton2);
		System.out.println(singleton3);
	}
}
