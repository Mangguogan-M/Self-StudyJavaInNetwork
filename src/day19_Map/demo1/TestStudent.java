package day19_Map.demo1;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
 * 演示TreeMap的排序功能
 */
public class TestStudent {

	public static void main(String[] args) {

		// 1.创建Map集合
		/*
		 * Map<Student,String> map = new TreeMap<>(new Comparator<Student>() {
		 * 
		 * @Override public int compare(Student o1, Student o2) { return
		 * o1.getAge()-o2.getAge(); } });
		 */

		Map<Student, String> map = new TreeMap<>(new Sort());
		map.put(new Student("凤姐", 18, "回眸一笑"), "101");
		map.put(new Student("小苍", 20, "在线陪聊"), "102");
		map.put(new Student("小玛丽", 17, "陪睡"), "103");

		Set<Entry<Student, String>> entrySet = map.entrySet();

		Iterator<Entry<Student, String>> iterator = entrySet.iterator();
		// 迭代器遍历
		while (iterator.hasNext()) {
			Entry<Student, String> entry = iterator.next();
			Student key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " " + value);
		}

	}

}
