package day25_Reflect.demo3;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 利用反射实现Map转JavaBean
 */
public class MapToBean {
	public static void main(String[] args) throws Exception {

		// 1.创建Map集合，向集合中添加K-V (要求key要与Javabean中属性名称对象)
		Map<String, Object> map = new HashMap<>();
		map.put("id", 2);
		map.put("name", "小红");
		map.put("age", 16);

		Student stu = new Student();

		// 获取运行时类
		Class<? extends Student> cls = stu.getClass();
		// 获取本类所有的属性
		Field[] fields = cls.getDeclaredFields();
		// 遍历每一个属性
		for (Field field : fields) {
			field.setAccessible(true);// 打破封装
			String name = field.getName();// 获取属性名称
			// 遍历map集合
			Set<Entry<String, Object>> entrySet = map.entrySet();
			Iterator<Entry<String, Object>> iterator = entrySet.iterator();
			while (iterator.hasNext()) {
				Entry<String, Object> next = iterator.next();
				// 获取map中value值
				Object value = next.getValue();
				// 获取map中key值
				String key = next.getKey();
				// 如果属性名称等于key
				if (name.equals(key)) {
					// 将value值赋值给属性
					field.set(stu, value);
				}
			}
		}
		// 属性JavaBean对象，验证是否转换成功
		System.out.println(stu);

	}
}
