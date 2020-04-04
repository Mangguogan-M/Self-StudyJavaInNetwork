package day25_Reflect.demo2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/*
 * ͨ�������ȡ����
 * 
 * 		getConstructor(Class<?>... parameterTypes)   ��ȡָ����������
 * 		getConstructors()    ��ȡ�������еĹ�������
 * 		getDeclaredConstructor(Class<?>... parameterTypes)  ��ȡ����ָ���Ĺ���(���л�˽��)
 *		getDeclaredConstructors()         ��ȡ�������еĹ���
 *			
 *
 *			��Declare�Ͳ���Declared����?
 *			��s�Ͳ���s������?
 */
public class Case2 {
	public static void main(String[] args) throws Exception {
		// 1.��������ʱ��
		Class<Goods> cls = Goods.class;
		System.out.println("------------getConstructors()����------------");
		// 2.��ȡ����
		// ����getConstructors() ��ȡ�������еĹ�������
		Constructor[] constructors = cls.getConstructors();
		// ��������ʱ�������еĹ���
		for (Constructor constructor : constructors) {
			// ��ȡ�������η�
			// getModifiers() ���ش����ӿ������������ Java �������η���
			int modifiers = constructor.getModifiers();
			String string = Modifier.toString(modifiers);// ��int�������η�������ʽת�����ַ���������ʽ

			// ��ȡ����
			String name = constructor.getName();
			// ��ȡ�����б�
			Class[] parameterTypes = constructor.getParameterTypes();
			for (Class class1 : parameterTypes) {
				// ��ȡ���
				String simpleName = class1.getSimpleName();
				System.out.println(simpleName);
			}
			System.out.println(string + "  " + name);
		}

		System.out.println("------------getConstructor(Class<?>... parameterTypes)����------------");
		// ��ȡָ�������Ĺ���
		Constructor<Goods> constructor = cls.getConstructor(String.class, Double.class, Integer.class);
		// ��������
		Goods goods = constructor.newInstance("����", 125.0, 18);
		System.out.println(goods);

		System.out.println("------------getDeclaredConstructors()����------------");
		Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
		for (Constructor<?> constructor2 : declaredConstructors) {
			// ��ȡ�������η�
			int modifiers = constructor2.getModifiers();
			String string = Modifier.toString(modifiers);// ��int�������η�������ʽת�����ַ���������ʽ
			// ��ȡ����
			String name = constructor2.getName();
			// ��ȡ�����б�
			Class<?>[] parameterTypes = constructor2.getParameterTypes();
			for (Class<?> class1 : parameterTypes) {
				// ���
				System.out.println(class1.getSimpleName());
			}
			System.out.println(string + "  " + name);
		}

		System.out.println("------------getDeclaredConstructor(Class<?>... parameterTypes)����------------");

		Constructor<Goods> constructor2 = cls.getDeclaredConstructor(String.class, Integer.class);
		// java.lang.IllegalAccessException: �Ƿ������쳣
		constructor2.setAccessible(true);// ���Ʒ�װ�����Զ�Java�������η��ļ��
		Goods goods2 = constructor2.newInstance("����", 289);
		System.out.println(goods2);
	}
}
