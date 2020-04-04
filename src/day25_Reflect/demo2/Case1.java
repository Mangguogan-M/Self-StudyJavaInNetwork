package day25_Reflect.demo2;

/*
 * 通过反射获取运行时类实现的接口以及父类
 */
public class Case1 {

	public static void main(String[] args) {
		// 1.获取运行时类
		Class cls = Goods.class;

		// 2.获取实现的接口
		Class[] interfaces = cls.getInterfaces();
		for (Class class1 : interfaces) {
			// getName()获取名称
			String name = class1.getName();
			System.out.println(name);

			// getSimpleName()获取简称
			String simpleName = class1.getSimpleName();
			System.out.println(simpleName);
		}

		// 3.获取父类
		Class cls2 = cls.getSuperclass();
		System.out.println(cls2.getName());
		System.out.println(cls2.getSimpleName());

	}
}
