package day25_Reflect.demo2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
 * ͨ�������ȡ��Ա����������
 * 
 * 		getDeclaredMethods() 		��ȡ�������еĳ�Ա����(���С�˽��)
 * 		getDeclaredMethod(String name, Class<?>... parameterTypes) ��ȡ����ָ���ĳ�Ա����(���С�˽��) 
 * 		getMethods() 			��ȡ�����Լ��������еĹ�����Ա����
 * 		getMethod(String name, Class<?>... parameterTypes)  ��ȡ�����Լ�����ָ���Ĺ�������
 */
public class Case4 {
	public static void main(String[] args) throws Exception {

		// 1.��ȡ����ʱ��
		Class<Goods> cls = Goods.class;

		// ��������ʱ��ʵ��
		Goods goods = cls.newInstance();

		System.out.println("-------------getDeclaredMethods()��������ʾ-------------");
		Method[] declaredMethods = cls.getDeclaredMethods();
		// ѭ����������ȡÿ������
		for (Method method : declaredMethods) {
			method.setAccessible(true);// ���Ʒ�װ
			// ��ȡ�������η�
			int modifiers = method.getModifiers();
			String string = Modifier.toString(modifiers);
			// ��ȡ����ֵ����
			Class<?> returnType = method.getReturnType();
			String simpleName = returnType.getSimpleName();
			// ��ȡ��������
			String name = method.getName();
			// ��ȡ�����б�
			Class<?>[] parameterTypes = method.getParameterTypes();
			for (Class<?> class1 : parameterTypes) {
				// ��ȡ���
				System.out.println(class1.getSimpleName());
			}
			System.out.println(string + "  " + simpleName + "  " + name);
			// ���÷���
			// �и����⣿��ѭ�������ֱ�ӵ��÷�������ÿ���������ᱻִ�У��������Ƿ����в�����һ����������������Ҫ���÷������ж�
			if (name.equals("setName")) {
				// ���÷���
				// ��һ���������ײ���÷����Ķ���
				// �ڶ������������ڷ������õĲ���
				method.invoke(goods, "�ڼ�ּ�־Ϳ���������.");
			}

		}
		System.out.println(goods);

		System.out.println("-------------getDeclaredMethod(String name, Class<?>... parameterTypes)��������ʾ-------------");
		Method method = cls.getDeclaredMethod("toString");
		// ��ȡ�������η�
		int modifiers = method.getModifiers();
		String string = Modifier.toString(modifiers);
		// ��ȡ����ֵ����
		Class<?> returnType = method.getReturnType();
		String simpleName = returnType.getSimpleName();
		// ��ȡ��������
		String name = method.getName();
		System.out.println(string + " " + simpleName + " " + name);
		// ���÷���
		Object value = method.invoke(goods, null);
		System.out.println(value);

		System.out.println("-------------getMethods()��������ʾ-------------");
		Method[] methods = cls.getMethods();
		for (Method method2 : methods) {
			// ��ȡ�������η�
			int modifiers2 = method2.getModifiers();
			String string2 = Modifier.toString(modifiers2);
			// ��ȡ����
			String name2 = method2.getName();
			// ��ȡ����ֵ����
			Class<?> returnType2 = method2.getReturnType();
			String simpleName2 = returnType2.getSimpleName();
			// ��ȡ�����б�
			Class<?>[] parameterTypes = method2.getParameterTypes();
			for (Class<?> class1 : parameterTypes) {
				System.out.println(class1.getSimpleName());
			}
			System.out.println(string2 + " " + name2 + " " + simpleName2);
		}

		System.out.println("-------------getMethod(String name, Class<?>... parameterTypes)��������ʾ-------------");
		Method method2 = cls.getMethod("show", String.class);
		// ��ȡ�������η�
		int modifiers2 = method2.getModifiers();
		String string2 = Modifier.toString(modifiers2);
		// ��ȡ����
		String name2 = method2.getName();
		// ��ȡ����ֵ����
		Class<?> returnType2 = method2.getReturnType();
		String simpleName2 = returnType2.getSimpleName();
		// ��ȡ�����б�
		Class<?>[] parameterTypes = method2.getParameterTypes();
		for (Class<?> class1 : parameterTypes) {
			System.out.println(class1.getSimpleName());
		}
		System.out.println(string2 + " " + name2 + " " + simpleName2);

		// ���÷���
		method2.invoke(goods, "����˧");

	}
}
