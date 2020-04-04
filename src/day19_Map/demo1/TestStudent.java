package day19_Map.demo1;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
 * ��ʾTreeMap��������
 */
public class TestStudent {

	public static void main(String[] args) {

		// 1.����Map����
		/*
		 * Map<Student,String> map = new TreeMap<>(new Comparator<Student>() {
		 * 
		 * @Override public int compare(Student o1, Student o2) { return
		 * o1.getAge()-o2.getAge(); } });
		 */

		Map<Student, String> map = new TreeMap<>(new Sort());
		map.put(new Student("���", 18, "����һЦ"), "101");
		map.put(new Student("С��", 20, "��������"), "102");
		map.put(new Student("С����", 17, "��˯"), "103");

		Set<Entry<Student, String>> entrySet = map.entrySet();

		Iterator<Entry<Student, String>> iterator = entrySet.iterator();
		// ����������
		while (iterator.hasNext()) {
			Entry<Student, String> entry = iterator.next();
			Student key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " " + value);
		}

	}

}
