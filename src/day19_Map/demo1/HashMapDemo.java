package day19_Map.demo1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 演示HashMap使用
 */
public class HashMapDemo {

	public static void main(String[] args) {

		// 1.创建Map集合
		Map<String, String> map = new HashMap<>();

		// 2.向集合中添加元素
		map.put("杭州", "阿里");
		map.put("北京", "腾讯");
		map.put("上海", "360");
		map.put("北京", "腾讯新");
		map.put(null, null);// HashMap允许null值和null键
		// 3.遍历集合
		System.out.println("-------------通过values()方法获取value值-------------");
		Collection<String> values = map.values();
		for (String string : values) {
			System.out.println(string);
		}

		System.out.println("-------------通过keySet()获取Map集合中所有的key值-------------");

		Set<String> set = map.keySet();
		for (String string : set) {
			// map中提供一个get(key),可以通过指定的key来获取对应的value值
			String value = map.get(string);
			System.out.println(string + "  " + value);
		}
		System.out.println("-------------通过EntrySet()获取Map集合中key和value的值-------------");

		// EntrySet 里面封装了 map中key和value
		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			String key = entry.getKey();// 获取key值
			String value = entry.getValue();// 获取value值
			System.out.println(key + " " + value);
		}

	}

}
