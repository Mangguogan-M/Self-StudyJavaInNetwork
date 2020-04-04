package day19_Map.demo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * ��ʾ���Ϲ������ʹ��
 * 
 * 		void sort()    		���󼯺��д洢��Ԫ�ؽ�������
		shuffle() 			�Լ����д洢��Ԫ�ؽ����������
		reverse() 			�������д洢��Ԫ��λ�ý��з�ת
		max()				��ȡ�����д洢�����Ԫ��
		min()				��ȡ�����д洢����СԪ��
		binarySearch() 		���ֲ���
		indexOfSubList() 	��ȡָ�����б��������б��е�һ�γ��ֵ�λ��
  		lastIndexOfSubList() ��ȡָ�����б��������б������һ�γ��ֵ�λ��
 */
public class CollectionsDemo {
	public static void main(String[] args) {

		// ����List���ϣ��洢ѧ����ĩ���Գɼ�
		List<Student> list = new ArrayList<>();

		Student s1 = new Student(1, "zhangsan", 0);
		Student s2 = new Student(2, "xiaoxinxin", 98);
		Student s3 = new Student(3, "xxmei", 88);
		Student s4 = new Student(4, "lisi", 60);

		// ���Ԫ��
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		List<Student> list2 = new ArrayList<>();
		list2.add(s2);

		// �Լ��Ͻ�������
		// Collections.sort(list);

		// ������� ������
		// Collections.shuffle(list);

		// ��ת
		// Collections.reverse(list);

		// ��Сֵ
		// Student student2 = Collections.min(list);
		// System.out.println(student2);

		// ���ֵ
		// Student max = Collections.max(list);
		// System.out.println(max);

		System.out.println(list);
		// binarySearch() ���ֲ���
		int binarySearch = Collections.binarySearch(list, s2);
		System.out.println(binarySearch);

		// indexOfSubList()
		int indexOfSubList = Collections.indexOfSubList(list, list2);
		System.out.println(indexOfSubList);

		// lastIndexOfSubList() ��ȡָ�����б��������б������һ�γ��ֵ�λ��
		int lastIndexOfSubList = Collections.lastIndexOfSubList(list, list2);
		System.out.println(lastIndexOfSubList);

		for (Student student : list) {
			System.out.println(student);
		}

	}
}
