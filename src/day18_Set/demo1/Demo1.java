package day18_Set.demo1;

import java.util.*;

/*
 * 通过HashSet存储Student类型的元素
 */
public class Demo1 {
	public static void main(String[] args) {

		// 1.创建Set集合限定元素类型为Student类型
		Set<Student> set = new HashSet<>();

		// 向集合中添加学生信息
		set.add(new Student("玉凤", 18));
		set.add(new Student("冰冰", 20));
		set.add(new Student("苍苍", 28));
		set.add(new Student("玉凤", 19));

		/*
		 * 为什么之前重复字符串没有存进HashSet集合中？ String类本身已经重写HashCode和equals方法
		 * 重写hashCode用于获取元素的存储位置 重写equal用于在两个元素位置相同的时候比较两个元素是否相等
		 */
		for (Student student : set) {
			System.out.println(student);
		}

	}
}
