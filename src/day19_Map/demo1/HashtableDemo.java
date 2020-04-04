package day19_Map.demo1;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/*
 * 演示Hashtable的使用
 */
public class HashtableDemo {
	public static void main(String[] args) {

		// 1.创建Map集合
		Map<String, String> map = new Hashtable<>();

		// 添加元素
		map.put("zhangsan", "java");
		map.put("lisi", "android");
		map.put("wangwu", "python");
		map.put("zhaoliu", "c++");// Hashtable 键不能为null、值也不能为null

		// 遍历集合
		Set<String> keySet = map.keySet();
		for (String string : keySet) {
			System.out.println(string + " " + map.get(string));
		}

	}
}
