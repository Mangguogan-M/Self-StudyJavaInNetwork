package day25_Reflect.demo2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/*
 * 通过反射获取构造
 * 
 * 		getConstructor(Class<?>... parameterTypes)   获取指定公共构造
 * 		getConstructors()    获取本类所有的公共构造
 * 		getDeclaredConstructor(Class<?>... parameterTypes)  获取本类指定的构造(共有或私有)
 *		getDeclaredConstructors()         获取本类所有的构造
 *			
 *
 *			加Declare和不加Declared区别?
 *			加s和不加s的区别?
 */
public class Case2 {
	public static void main(String[] args) throws Exception {
		// 1.创建运行时类
		Class<Goods> cls = Goods.class;
		System.out.println("------------getConstructors()方法------------");
		// 2.获取构造
		// 调用getConstructors() 获取本类所有的公共构造
		Constructor[] constructors = cls.getConstructors();
		// 遍历运行时类里所有的构造
		for (Constructor constructor : constructors) {
			// 获取访问修饰符
			// getModifiers() 返回此类或接口以整数编码的 Java 语言修饰符。
			int modifiers = constructor.getModifiers();
			String string = Modifier.toString(modifiers);// 将int类型修饰符表现形式转换成字符串表现形式

			// 获取名称
			String name = constructor.getName();
			// 获取参数列表
			Class[] parameterTypes = constructor.getParameterTypes();
			for (Class class1 : parameterTypes) {
				// 获取简称
				String simpleName = class1.getSimpleName();
				System.out.println(simpleName);
			}
			System.out.println(string + "  " + name);
		}

		System.out.println("------------getConstructor(Class<?>... parameterTypes)方法------------");
		// 获取指定参数的构造
		Constructor<Goods> constructor = cls.getConstructor(String.class, Double.class, Integer.class);
		// 创建对象
		Goods goods = constructor.newInstance("张三", 125.0, 18);
		System.out.println(goods);

		System.out.println("------------getDeclaredConstructors()方法------------");
		Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
		for (Constructor<?> constructor2 : declaredConstructors) {
			// 获取访问修饰符
			int modifiers = constructor2.getModifiers();
			String string = Modifier.toString(modifiers);// 将int类型修饰符表现形式转换成字符串表现形式
			// 获取名称
			String name = constructor2.getName();
			// 获取参数列表
			Class<?>[] parameterTypes = constructor2.getParameterTypes();
			for (Class<?> class1 : parameterTypes) {
				// 简称
				System.out.println(class1.getSimpleName());
			}
			System.out.println(string + "  " + name);
		}

		System.out.println("------------getDeclaredConstructor(Class<?>... parameterTypes)方法------------");

		Constructor<Goods> constructor2 = cls.getDeclaredConstructor(String.class, Integer.class);
		// java.lang.IllegalAccessException: 非法访问异常
		constructor2.setAccessible(true);// 打破封装，忽略对Java访问修饰符的检查
		Goods goods2 = constructor2.newInstance("娃娃", 289);
		System.out.println(goods2);
	}
}
