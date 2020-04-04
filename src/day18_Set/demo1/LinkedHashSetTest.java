package day18_Set.demo1;

import java.util.LinkedHashSet;

/*
 * 演示 LinkedHashSet
 */
public class LinkedHashSetTest {
	public static void main(String[] args) {

		// 1.创建Set集合限定存储元素的类型为String类型
		LinkedHashSet<String> set = new LinkedHashSet<>();

		set.add("绝地求生");
		set.add("球球大作战");
		set.add("守望先锋");
		set.add("超级玛丽奥");
		set.add("球球大作战");

		for (String string : set) {
			System.out.println(string);
		}

	}
}
