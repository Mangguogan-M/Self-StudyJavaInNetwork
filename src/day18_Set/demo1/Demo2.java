package day18_Set.demo1;

import java.util.Set;
import java.util.TreeSet;

/*
 * ��ʾ������
 * 		����TreeSet����  �洢StudentԪ�����ͣ�����ѧ�������������
 */
public class Demo2 {

	public static void main(String[] args) {

		Set<Student> set = new TreeSet<>();

		set.add(new Student("b���", 18));
		set.add(new Student("����", 20));
		set.add(new Student("a�Բ�", 18));
		set.add(new Student("����", 19));

		for (Student student : set) {
			System.out.println(student);
		}

	}
}
