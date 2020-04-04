package day25_Reflect.demo3;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 利用反射将Student对象的值，装载到Map中
 */
public class BeanToMap {
	public static void main(String[] args) throws Exception {
		Student stu = new Student(1, "张三", 18);

		Map<String, Object> map = new HashMap<>();

		Class<? extends Student> cls = stu.getClass();

		Field[] fields = cls.getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			// 属性名称
			String key = field.getName();
			// 属性值
			Object value = field.get(stu);

			// 装载到map集合中
			map.put(key, value);
		}

		// 遍历map集合
		Set<Entry<String, Object>> entrySet = map.entrySet();
		Iterator<Entry<String, Object>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Entry<String, Object> next = iterator.next();
			Object value = next.getValue();
			String key = next.getKey();
			System.out.println(key + ":" + value);
		}

	}
}
