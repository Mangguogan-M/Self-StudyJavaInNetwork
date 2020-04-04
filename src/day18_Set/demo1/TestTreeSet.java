package day18_Set.demo1;

import java.util.Set;
import java.util.TreeSet;

/*
 * 实现使用TreeSet集合进行存储数据并遍历
 * 
 * 		创建TreeSet集合对象，向其中存储180，169，157，169，185五个学生身高，遍历输出查询结果。
 */
public class TestTreeSet {
	public static void main(String[] args) {

		// 创建TreeSet集合
		Set<Integer> set = new TreeSet<>();

		// 添加元素
		set.add(180);
		set.add(169);
		set.add(157);
		set.add(169);
		set.add(185);

		for (Integer integer : set) {
			System.out.println(integer);
		}

	}
}
