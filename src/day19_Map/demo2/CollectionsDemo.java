package day19_Map.demo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 演示集合工具类的使用
 * 
 * 		void sort()    		对象集合中存储的元素进行排序
		shuffle() 			对集合中存储的元素进行随机排列
		reverse() 			将集合中存储的元素位置进行反转
		max()				获取集合中存储的最大元素
		min()				获取集合中存储的最小元素
		binarySearch() 		二分查找
		indexOfSubList() 	获取指定子列表在整个列表中第一次出现的位置
  		lastIndexOfSubList() 获取指定子列表在整个列表中最后一次出现的位置
 */
public class CollectionsDemo {
	public static void main(String[] args) {

		// 创建List集合，存储学生期末考试成绩
		List<Student> list = new ArrayList<>();

		Student s1 = new Student(1, "zhangsan", 0);
		Student s2 = new Student(2, "xiaoxinxin", 98);
		Student s3 = new Student(3, "xxmei", 88);
		Student s4 = new Student(4, "lisi", 60);

		// 添加元素
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		List<Student> list2 = new ArrayList<>();
		list2.add(s2);

		// 对集合进行排序
		// Collections.sort(list);

		// 随机排序 ，打乱
		// Collections.shuffle(list);

		// 反转
		// Collections.reverse(list);

		// 最小值
		// Student student2 = Collections.min(list);
		// System.out.println(student2);

		// 最大值
		// Student max = Collections.max(list);
		// System.out.println(max);

		System.out.println(list);
		// binarySearch() 二分查找
		int binarySearch = Collections.binarySearch(list, s2);
		System.out.println(binarySearch);

		// indexOfSubList()
		int indexOfSubList = Collections.indexOfSubList(list, list2);
		System.out.println(indexOfSubList);

		// lastIndexOfSubList() 获取指定子列表在整个列表中最后一次出现的位置
		int lastIndexOfSubList = Collections.lastIndexOfSubList(list, list2);
		System.out.println(lastIndexOfSubList);

		for (Student student : list) {
			System.out.println(student);
		}

	}
}
