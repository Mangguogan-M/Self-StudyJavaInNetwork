package day18_Set.demo2;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
 * 实现使用TreeSet集合进行存储数据并遍历。
 * 		创建学生类Student 进行合理封装 并重写hashCode和equals方法
 * 		创建TreeSet集合对象，要求使用泛型，限定类型为Student
 * 		创建比较器，按照年龄升序排序，若年龄重复则按照姓名排序
 * 		使用比较器对象TreeSet集合排序
 */
public class TestStudent {
	public static void main(String[] args) {

		// 创建TreeSet集合对象，要求使用泛型，限定类型为Student
		// 第一种写法
		// Set<Student> set = new TreeSet<>(new Sort());

		// 第二种写法
		Set<Student> set = new TreeSet<>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// 按照年龄升序排序，若年龄重复则按照姓名排序
				return o1.getAge() - o2.getAge() == 0 ? o1.getName().compareTo(o2.getName())
						: o1.getAge() - o2.getAge();
			}
		});

		set.add(new Student("fqls", 18));
		set.add(new Student("xzls", 30));
		set.add(new Student("cls", 18));

		for (Student student : set) {
			System.out.println(student);
		}

	}
}
