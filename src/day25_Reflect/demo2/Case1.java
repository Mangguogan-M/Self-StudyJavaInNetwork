package day25_Reflect.demo2;

/*
 * ͨ�������ȡ����ʱ��ʵ�ֵĽӿ��Լ�����
 */
public class Case1 {

	public static void main(String[] args) {
		// 1.��ȡ����ʱ��
		Class cls = Goods.class;

		// 2.��ȡʵ�ֵĽӿ�
		Class[] interfaces = cls.getInterfaces();
		for (Class class1 : interfaces) {
			// getName()��ȡ����
			String name = class1.getName();
			System.out.println(name);

			// getSimpleName()��ȡ���
			String simpleName = class1.getSimpleName();
			System.out.println(simpleName);
		}

		// 3.��ȡ����
		Class cls2 = cls.getSuperclass();
		System.out.println(cls2.getName());
		System.out.println(cls2.getSimpleName());

	}
}
