package day25_Reflect.demo3;

import java.lang.reflect.Field;

/*
 * ͨ������ʵ��JavaBeanתJavaBean
 */
public class BeanToBean {
	public static void main(String[] args) throws Exception {

		// 1.����Teacher���󲢸�ֵ
		Teacher t = new Teacher(1, "����ʦ", 18);
		Student stu = new Student();

		Class<? extends Student> cls2 = stu.getClass();
		Field[] declaredFields = cls2.getDeclaredFields();

		// ���÷��佫Teacher����ת����Student����
		Class<? extends Teacher> cls = t.getClass();
		Field[] fields = cls.getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);// ���Ʒ�װ
			String name = field.getName();// ��ȡ����
			Object value = field.get(t);// ��ȡֵ

			String simpleName = field.getType().getSimpleName();// ��ȡ���ͼ��

			for (Field field2 : declaredFields) {
				field2.setAccessible(true);
				String name2 = field2.getName();
				String simpleName2 = field2.getType().getSimpleName();

				// �ж����������ͬ����������ͬ�ͽ�teacher�����ж����ֵ��ֵ��student
				if (name.equals(name2) && simpleName.equals(simpleName2)) {
					field2.set(stu, value);
				}
			}
		}
		System.out.println(stu);

	}
}
