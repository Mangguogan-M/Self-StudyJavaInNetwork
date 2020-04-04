package day18_Set.demo1;

import java.util.Set;
import java.util.TreeSet;

/*
 * 演示排序功能
 * 		创建TreeSet集合  存储Student元素类型，根据学生年龄进行排序
 */
public class Demo2 {

	public static void main(String[] args) {

		Set<Student> set = new TreeSet<>();

		set.add(new Student("b玉凤", 18));
		set.add(new Student("冰冰", 20));
		set.add(new Student("a苍苍", 18));
		set.add(new Student("杨幂", 19));

		for (Student student : set) {
			System.out.println(student);
		}

	}
}
