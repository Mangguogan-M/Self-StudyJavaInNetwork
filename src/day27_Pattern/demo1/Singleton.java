package day27_Pattern.demo1;

/*
 * 单例设计模式
 * 
 * 	单例模式的特点：
		1.单例类只能有一个实例
		2.单例类必须自己创建自己的唯一实例
		3.单例类必须给所有其他对象提供这一实例
 */
//饿汉式单例
/*
 *  描述：这种方式比较常用，但容易产生垃圾对象。
	优点：没有加锁，执行效率会提高。
	缺点：类加载时就初始化，浪费内存。
 */
/*public class Singleton {
	//必须自己创建自己的唯一实例
	private static Singleton singleton = new Singleton();//浪费内存空间
	
	//私有化构造
	private Singleton(){
	}
	
	//给外界提供公共方法来创建对象
	public static Singleton getInstance(){
		return singleton;
	}
	
}*/
/*
 * 懒汉式
 * 
 * 		可能会发生线程安全问题。
 * 
 * 		面试时候，面试官让你写单例。
 * 			推荐写这种，开发的时候推荐写饿汉式单例。
 */
/*public class Singleton{
	private static Singleton singleton = null;
	
	//私有化构造
	private Singleton(){
	}
	
	//给外界提供公共方法来创建对象
	public static synchronized Singleton getInstance(){
		if(singleton == null){
			singleton = new Singleton();
		}
		return singleton;
	}
}*/

public class Singleton {

	private static Singleton singleton = null;

	// 私有化构造
	private Singleton() {
	}

	// 给外界提供公共方法来创建对象
	public static synchronized Singleton getInstance() {
		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}

}
