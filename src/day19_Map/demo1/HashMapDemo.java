package day19_Map.demo1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * ��ʾHashMapʹ��
 */
public class HashMapDemo {

	public static void main(String[] args) {

		// 1.����Map����
		Map<String, String> map = new HashMap<>();

		// 2.�򼯺������Ԫ��
		map.put("����", "����");
		map.put("����", "��Ѷ");
		map.put("�Ϻ�", "360");
		map.put("����", "��Ѷ��");
		map.put(null, null);// HashMap����nullֵ��null��
		// 3.��������
		System.out.println("-------------ͨ��values()������ȡvalueֵ-------------");
		Collection<String> values = map.values();
		for (String string : values) {
			System.out.println(string);
		}

		System.out.println("-------------ͨ��keySet()��ȡMap���������е�keyֵ-------------");

		Set<String> set = map.keySet();
		for (String string : set) {
			// map���ṩһ��get(key),����ͨ��ָ����key����ȡ��Ӧ��valueֵ
			String value = map.get(string);
			System.out.println(string + "  " + value);
		}
		System.out.println("-------------ͨ��EntrySet()��ȡMap������key��value��ֵ-------------");

		// EntrySet �����װ�� map��key��value
		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			String key = entry.getKey();// ��ȡkeyֵ
			String value = entry.getValue();// ��ȡvalueֵ
			System.out.println(key + " " + value);
		}

	}

}
