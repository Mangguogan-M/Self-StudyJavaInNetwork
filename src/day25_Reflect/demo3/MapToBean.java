package day25_Reflect.demo3;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * ���÷���ʵ��MapתJavaBean
 */
public class MapToBean {
	public static void main(String[] args) throws Exception {

		// 1.����Map���ϣ��򼯺������K-V (Ҫ��keyҪ��Javabean���������ƶ���)
		Map<String, Object> map = new HashMap<>();
		map.put("id", 2);
		map.put("name", "С��");
		map.put("age", 16);

		Student stu = new Student();

		// ��ȡ����ʱ��
		Class<? extends Student> cls = stu.getClass();
		// ��ȡ�������е�����
		Field[] fields = cls.getDeclaredFields();
		// ����ÿһ������
		for (Field field : fields) {
			field.setAccessible(true);// ���Ʒ�װ
			String name = field.getName();// ��ȡ��������
			// ����map����
			Set<Entry<String, Object>> entrySet = map.entrySet();
			Iterator<Entry<String, Object>> iterator = entrySet.iterator();
			while (iterator.hasNext()) {
				Entry<String, Object> next = iterator.next();
				// ��ȡmap��valueֵ
				Object value = next.getValue();
				// ��ȡmap��keyֵ
				String key = next.getKey();
				// ����������Ƶ���key
				if (name.equals(key)) {
					// ��valueֵ��ֵ������
					field.set(stu, value);
				}
			}
		}
		// ����JavaBean������֤�Ƿ�ת���ɹ�
		System.out.println(stu);

	}
}
