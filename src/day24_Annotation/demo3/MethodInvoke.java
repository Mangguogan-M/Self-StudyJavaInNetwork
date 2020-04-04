package day24_Annotation.demo3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodInvoke {

	public static void invoke(String string) throws Exception {
		// 获取运行时类
		Class cls = Color.class;

		// 获取本类所有方法
		Method[] methods = cls.getDeclaredMethods();

		for (Method method : methods) {

			// 判断方法上是否有注解
			if (method.isAnnotationPresent(MyAnnotation.class)) {
				MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
				String value = annotation.value();
				if (string.equals(value)) {
					method.invoke(cls.newInstance());
				}
			}

		}

	}

}
