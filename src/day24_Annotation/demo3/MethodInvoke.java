package day24_Annotation.demo3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodInvoke {

	public static void invoke(String string) throws Exception {
		// ��ȡ����ʱ��
		Class cls = Color.class;

		// ��ȡ�������з���
		Method[] methods = cls.getDeclaredMethods();

		for (Method method : methods) {

			// �жϷ������Ƿ���ע��
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
