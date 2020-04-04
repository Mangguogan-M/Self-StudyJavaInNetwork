package day09;

/*
 * 编程实现Singleton类的封装
 */
public class Singleton {

	// private static Singleton s = new Singleton();//饿汉式
	private static Singleton sin = null;// 懒汉式

	// 1.自定义无参的构造方法，使用private 关键字修饰
	private Singleton() {
	}

	// 提供一个共有的get成员变量的方法来将成员变量返回出去
	public static Singleton getInstance() {

		if (sin == null) {
			sin = new Singleton();
		}
		return sin;
	}

}
