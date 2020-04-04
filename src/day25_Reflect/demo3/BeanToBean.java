package day25_Reflect.demo3;

import java.lang.reflect.Field;

/*
 * 通过反射实现JavaBean转JavaBean
 */
public class BeanToBean {
	public static void main(String[] args) throws Exception {

		// 1.创建Teacher对象并赋值
		Teacher t = new Teacher(1, "王老师", 18);
		Student stu = new Student();

		Class<? extends Student> cls2 = stu.getClass();
		Field[] declaredFields = cls2.getDeclaredFields();

		// 利用反射将Teacher对象转换成Student对象
		Class<? extends Teacher> cls = t.getClass();
		Field[] fields = cls.getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);// 打破封装
			String name = field.getName();// 获取名称
			Object value = field.get(t);// 获取值

			String simpleName = field.getType().getSimpleName();// 获取类型简称

			for (Field field2 : declaredFields) {
				field2.setAccessible(true);
				String name2 = field2.getName();
				String simpleName2 = field2.getType().getSimpleName();

				// 判断如果名称相同并且类型相同就将teacher对象中对象的值赋值给student
				if (name.equals(name2) && simpleName.equals(simpleName2)) {
					field2.set(stu, value);
				}
			}
		}
		System.out.println(stu);

	}
}
