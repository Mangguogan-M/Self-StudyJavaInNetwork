package day18_Set.demo1;

import java.util.*;

/*
 * HashSet使用
 */
public class HashSetTest {
	public static void main(String[] args) {

		// 1.声明Set集合
		Set<String> set = new HashSet<String>();

		// 2.向集合中添加车票信息
		set.add("北京---河南");
		set.add("河北---邯郸");
		set.add("山西---大同");
		set.add("河北---邯郸");

		System.out.println("--------第一种遍历方法 增强for循环-------");
		for (String string : set) {
			System.out.println(string);
		}

		System.out.println("--------第二种遍历方法 迭代器遍历-------");
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
		}

		System.out.println("--------第三种遍历方法 toString-------");
		System.out.println(set);

		System.out.println("--------第四种遍历方法 普通for循环-------");

		// set集合是无序的，因为没有下标
		for (int i = 0; i < set.size(); i++) {

		}

	}
}
