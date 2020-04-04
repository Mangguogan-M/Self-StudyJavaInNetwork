package day19_Map.demo1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
 * 演示LinkedHashMap使用
 * 		存储有序的集合
 */
public class LinkedHashMapDemo {
	public static void main(String[] args) {

		Map<String, Integer> map = new LinkedHashMap<>();

		map.put("bbls", 30);
		map.put("llls", 18);
		map.put("dnls", 35);

		Set<String> keySet = map.keySet();

		for (String string : keySet) {
			Integer value = map.get(string);
			System.out.println(string + " " + value);
		}

	}
}
