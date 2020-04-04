package day18_Set.demo2;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
 * ʵ��ʹ��TreeSet���Ͻ��д洢���ݲ�������
 * 		����ѧ����Student ���к����װ ����дhashCode��equals����
 * 		����TreeSet���϶���Ҫ��ʹ�÷��ͣ��޶�����ΪStudent
 * 		�����Ƚ����������������������������ظ�������������
 * 		ʹ�ñȽ�������TreeSet��������
 */
public class TestStudent {
	public static void main(String[] args) {

		// ����TreeSet���϶���Ҫ��ʹ�÷��ͣ��޶�����ΪStudent
		// ��һ��д��
		// Set<Student> set = new TreeSet<>(new Sort());

		// �ڶ���д��
		Set<Student> set = new TreeSet<>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// �����������������������ظ�������������
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
