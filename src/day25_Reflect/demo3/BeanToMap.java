package day25_Reflect.demo3;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * ���÷��佫Student�����ֵ��װ�ص�Map��
 */
public class BeanToMap {
	public static void main(String[] args) throws Exception {
		Student stu = new Student(1, "����", 18);

		Map<String, Object> map = new HashMap<>();

		Class<? extends Student> cls = stu.getClass();

		Field[] fields = cls.getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			// ��������
			String key = field.getName();
			// ����ֵ
			Object value = field.get(stu);

			// װ�ص�map������
			map.put(key, value);
		}

		// ����map����
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
