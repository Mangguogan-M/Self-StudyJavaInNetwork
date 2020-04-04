package day25_Reflect.demo2;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
 * ͨ�������ȡ����ʱ���г�Ա����
 * 		getFields() 				��ȡ�����Լ��������еĹ�������
 * 		getField(String name)       ��ȡ�����Լ�������ָ��������(ֻ�ܻ�ȡ���е�)
 * 		getDeclaredFields() 		��ȡ���������е�����(���С�˽��)
 * 		getDeclaredField(String name) ��ȡ������ָ��������(˽�С����ж����Ի�ȡ)
 * 
 */
public class Case3 {
	public static void main(String[] args) throws Exception {
		// 1.��ȡ����ʱ��
		Goods g = new Goods();
		Class<? extends Goods> cls = g.getClass();

		Goods goods = new Goods("ϴ��ˮ", 12.0, 200);

		System.out.println("--------------getDeclaredFields()------------");
		// getDeclaredFields() ��ȡ���������е�����(���С�˽��)
		Field[] fields = cls.getDeclaredFields();
		// ����ÿһ�����Զ���
		for (Field field : fields) {
			field.setAccessible(true);// ���Ʒ�װ
			// ��ȡ�������η�
			int modifiers = field.getModifiers();
			String string = Modifier.toString(modifiers);
			// ��ȡ��������
			Class<?> type = field.getType();
			String simpleName = type.getSimpleName();
			// ��ȡ��������
			String name = field.getName();
			// ��ȡ����ֵ
			Object value = field.get(goods);
			System.out.println(string + "  " + simpleName + "  " + name + "  " + value);
			// ��������ֵ
			// �и����⣿ ������ѭ������˭��������ֵ
			if ("id".equals(name)) {
				field.set(goods, 1);
			} else if ("name".equals(name)) {
				field.set(goods, "ϴ����");
			} else if ("price".equals(name)) {
				field.set(goods, 34.0);
			} else if ("storage".equals(name)) {
				field.set(goods, 1000);
			}
		}
		System.out.println(goods);

		System.out.println("--------------getDeclaredField(String name)------------");
		Field field = cls.getDeclaredField("name");
		field.setAccessible(true);// ���Ʒ�װ
		// ��ȡ�������η�
		int modifiers = field.getModifiers();
		String string = Modifier.toString(modifiers);
		// ��ȡ��������
		Class<?> type = field.getType();
		String simpleName = type.getSimpleName();
		// ��ȡ����
		String name = field.getName();
		// ��������ֵ
		field.set(goods, "ϴ�ྫ");

		// ��ȡ����ֵ
		Object value = field.get(goods);

		System.out.println(string + "  " + simpleName + "  " + name + "  " + value);

		System.out.println("--------------getFields() ------------");
		Field[] fields2 = cls.getFields();
		for (Field field2 : fields2) {
			// ��ȡ�������η�
			int modifiers2 = field2.getModifiers();
			String string2 = Modifier.toString(modifiers2);
			// ��ȡ��������
			Class<?> type2 = field2.getType();
			String simpleName2 = type2.getSimpleName();
			// ��ȡ����
			String name2 = field2.getName();
			System.out.println(string2 + "  " + simpleName2 + " " + name2);
		}

		System.out.println("--------------getField(String name) ------------");
		Field field2 = cls.getField("gname");
		// ��ȡ�������η�
		int modifiers2 = field2.getModifiers();
		String string2 = Modifier.toString(modifiers2);
		// ��ȡ��������
		Class<?> type2 = field2.getType();
		String simpleName2 = type2.getSimpleName();
		// ��ȡ����
		String name2 = field2.getName();
		// ��������ֵ
		field.set(goods, "����");
		// ��ȡ����ֵ
		Object val = field.get(goods);

		System.out.println(string2 + "  " + simpleName2 + " " + name2 + "  " + val);

	}
}
