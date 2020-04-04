package day18_Set.demo2;

import java.util.Comparator;

public class Sort implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		// 按照年龄升序排序，若年龄重复则按照姓名排序
		return o1.getAge() - o2.getAge() == 0 ? o1.getName().compareTo(o2.getName()) : o1.getAge() - o2.getAge();
	}

}
