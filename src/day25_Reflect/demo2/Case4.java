package day25_Reflect.demo2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
 * 通过反射获取成员方法并操作
 * 
 * 		getDeclaredMethods() 		获取本类所有的成员方法(共有、私有)
 * 		getDeclaredMethod(String name, Class<?>... parameterTypes) 获取本类指定的成员方法(共有、私有) 
 * 		getMethods() 			获取本类以及父类所有的公共成员方法
 * 		getMethod(String name, Class<?>... parameterTypes)  获取本类以及父类指定的公共方法
 */
public class Case4 {
	public static void main(String[] args) throws Exception {

		// 1.获取运行时类
		Class<Goods> cls = Goods.class;

		// 创建运行时类实例
		Goods goods = cls.newInstance();

		System.out.println("-------------getDeclaredMethods()方法的演示-------------");
		Method[] declaredMethods = cls.getDeclaredMethods();
		// 循环遍历，获取每个方法
		for (Method method : declaredMethods) {
			method.setAccessible(true);// 打破封装
			// 获取访问修饰符
			int modifiers = method.getModifiers();
			String string = Modifier.toString(modifiers);
			// 获取返回值类型
			Class<?> returnType = method.getReturnType();
			String simpleName = returnType.getSimpleName();
			// 获取方法名称
			String name = method.getName();
			// 获取参数列表
			Class<?>[] parameterTypes = method.getParameterTypes();
			for (Class<?> class1 : parameterTypes) {
				// 获取简称
				System.out.println(class1.getSimpleName());
			}
			System.out.println(string + "  " + simpleName + "  " + name);
			// 调用方法
			// 有个问题？在循环内如果直接调用方法，那每个方法都会被执行，但是我们方法中参数不一样，所以这个如果需要调用方法需判断
			if (name.equals("setName")) {
				// 调用方法
				// 第一个参数：底层调用方法的对象
				// 第二个参数：用于方法调用的参数
				method.invoke(goods, "在坚持坚持就可以用膳了.");
			}

		}
		System.out.println(goods);

		System.out.println("-------------getDeclaredMethod(String name, Class<?>... parameterTypes)方法的演示-------------");
		Method method = cls.getDeclaredMethod("toString");
		// 获取访问修饰符
		int modifiers = method.getModifiers();
		String string = Modifier.toString(modifiers);
		// 获取返回值类型
		Class<?> returnType = method.getReturnType();
		String simpleName = returnType.getSimpleName();
		// 获取方法名称
		String name = method.getName();
		System.out.println(string + " " + simpleName + " " + name);
		// 调用方法
		Object value = method.invoke(goods, null);
		System.out.println(value);

		System.out.println("-------------getMethods()方法的演示-------------");
		Method[] methods = cls.getMethods();
		for (Method method2 : methods) {
			// 获取访问修饰符
			int modifiers2 = method2.getModifiers();
			String string2 = Modifier.toString(modifiers2);
			// 获取名称
			String name2 = method2.getName();
			// 获取返回值类型
			Class<?> returnType2 = method2.getReturnType();
			String simpleName2 = returnType2.getSimpleName();
			// 获取参数列表
			Class<?>[] parameterTypes = method2.getParameterTypes();
			for (Class<?> class1 : parameterTypes) {
				System.out.println(class1.getSimpleName());
			}
			System.out.println(string2 + " " + name2 + " " + simpleName2);
		}

		System.out.println("-------------getMethod(String name, Class<?>... parameterTypes)方法的演示-------------");
		Method method2 = cls.getMethod("show", String.class);
		// 获取访问修饰符
		int modifiers2 = method2.getModifiers();
		String string2 = Modifier.toString(modifiers2);
		// 获取名称
		String name2 = method2.getName();
		// 获取返回值类型
		Class<?> returnType2 = method2.getReturnType();
		String simpleName2 = returnType2.getSimpleName();
		// 获取参数列表
		Class<?>[] parameterTypes = method2.getParameterTypes();
		for (Class<?> class1 : parameterTypes) {
			System.out.println(class1.getSimpleName());
		}
		System.out.println(string2 + " " + name2 + " " + simpleName2);

		// 调用方法
		method2.invoke(goods, "我真帅");

	}
}
