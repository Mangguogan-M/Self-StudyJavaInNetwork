package day25_Reflect.demo1;

/*
 * 反射获取Class类实例的三种方式
 * 		第一种方式：
 * 			利用对象调用getClass()方法获取该对象的Class实例
 * 			对象.getClass()
 * 			例如：Class cls = new Student().getClass();
 * 		第二种方式：
 * 			类名.class
 * 			例如：Class cls = Student.class;
 * 		第三种方式:这种方式比较常用   推荐  一般开发的时候都是用这种方式
 * 			使用Class类的静态方法forName("包名.类名")，用类的名字获取一个Class实例。
 * 			Class.forName("全限定名");
 * 			例如：Class cls = Class.forName("entity.Student");
 */
public class Case1 {
	public static void main(String[] args) throws ClassNotFoundException {
		// 获取Goods运行时类
		// 第三种获取方式
		Class<?> cls = Class.forName("/src/day25_Reflect/demo1/Goods");
		// 第二种方式
		Class cls1 = Goods.class;
		// 第一种方式
		// 缺点必须创建这个对象，首先有这个类，如果没有直接报错
		Class<? extends Goods> cls2 = new Goods().getClass();

		// == 比较的是地址 验证cls和cls1是否指向同一个对象
		System.out.println(cls == cls1);

		System.out.println(cls1 == cls2);

	}
}
