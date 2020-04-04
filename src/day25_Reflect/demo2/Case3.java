package day25_Reflect.demo2;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
 * 通过反射获取运行时类中成员变量
 * 		getFields() 				获取本类以及父类所有的公共属性
 * 		getField(String name)       获取本类以及父类中指定的属性(只能获取共有的)
 * 		getDeclaredFields() 		获取本类中所有的属性(共有、私有)
 * 		getDeclaredField(String name) 获取本类中指定的属性(私有、共有都可以获取)
 * 
 */
public class Case3 {
	public static void main(String[] args) throws Exception {
		// 1.获取运行时类
		Goods g = new Goods();
		Class<? extends Goods> cls = g.getClass();

		Goods goods = new Goods("洗发水", 12.0, 200);

		System.out.println("--------------getDeclaredFields()------------");
		// getDeclaredFields() 获取本类中所有的属性(共有、私有)
		Field[] fields = cls.getDeclaredFields();
		// 遍历每一个属性对象
		for (Field field : fields) {
			field.setAccessible(true);// 打破封装
			// 获取访问修饰符
			int modifiers = field.getModifiers();
			String string = Modifier.toString(modifiers);
			// 获取属性类型
			Class<?> type = field.getType();
			String simpleName = type.getSimpleName();
			// 获取属性名称
			String name = field.getName();
			// 获取属性值
			Object value = field.get(goods);
			System.out.println(string + "  " + simpleName + "  " + name + "  " + value);
			// 设置属性值
			// 有个问题？ 我们在循环里，你给谁设置属性值
			if ("id".equals(name)) {
				field.set(goods, 1);
			} else if ("name".equals(name)) {
				field.set(goods, "洗面奶");
			} else if ("price".equals(name)) {
				field.set(goods, 34.0);
			} else if ("storage".equals(name)) {
				field.set(goods, 1000);
			}
		}
		System.out.println(goods);

		System.out.println("--------------getDeclaredField(String name)------------");
		Field field = cls.getDeclaredField("name");
		field.setAccessible(true);// 打破封装
		// 获取访问修饰符
		int modifiers = field.getModifiers();
		String string = Modifier.toString(modifiers);
		// 获取属性类型
		Class<?> type = field.getType();
		String simpleName = type.getSimpleName();
		// 获取名称
		String name = field.getName();
		// 设置属性值
		field.set(goods, "洗洁精");

		// 获取属性值
		Object value = field.get(goods);

		System.out.println(string + "  " + simpleName + "  " + name + "  " + value);

		System.out.println("--------------getFields() ------------");
		Field[] fields2 = cls.getFields();
		for (Field field2 : fields2) {
			// 获取访问修饰符
			int modifiers2 = field2.getModifiers();
			String string2 = Modifier.toString(modifiers2);
			// 获取属性类型
			Class<?> type2 = field2.getType();
			String simpleName2 = type2.getSimpleName();
			// 获取名称
			String name2 = field2.getName();
			System.out.println(string2 + "  " + simpleName2 + " " + name2);
		}

		System.out.println("--------------getField(String name) ------------");
		Field field2 = cls.getField("gname");
		// 获取访问修饰符
		int modifiers2 = field2.getModifiers();
		String string2 = Modifier.toString(modifiers2);
		// 获取属性类型
		Class<?> type2 = field2.getType();
		String simpleName2 = type2.getSimpleName();
		// 获取名称
		String name2 = field2.getName();
		// 设置属性值
		field.set(goods, "旺财");
		// 获取属性值
		Object val = field.get(goods);

		System.out.println(string2 + "  " + simpleName2 + " " + name2 + "  " + val);

	}
}
